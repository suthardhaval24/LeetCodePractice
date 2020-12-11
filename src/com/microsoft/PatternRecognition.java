package com.microsoft;

public class PatternRecognition {
    public static void searchPattern(String input) {
        int idx = input.indexOf(';');
        String pattern = input.substring(0, idx);
        String text = input.substring(idx + 1);

        String[] textArr = text.split("\\|");
        StringBuilder sb = new StringBuilder();
        int count = 0, res = 0;

        for (String s : textArr) {

            count = kmpSearch(pattern, s);
            res += count;
            sb.append(count + "|");
        }
        System.out.println(sb.append(res));
    }

    public static int kmpSearch(String pat, String txt) {
        int pLen = pat.length();
        int tLen = txt.length();
        int count = 0;

        if (pLen == 0)
            return count;

        // create lps[] that will hold the longest prefix suffix values for pattern
        int lps[] = new int[pLen];
        int j = 0; // index for pat[]

        // Preprocess the pattern (calculate lps[] array)
        computeLPSArray(pat, pLen, lps);

        int i = 0; // index for txt[]
        while (i < tLen) {
            if (pat.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j == pLen) {
                //System.out.println("Found pattern " + "at index " + (i - j));
                count++;
                j = lps[j - 1];
            }

            // mismatch after j matches
            else if (i < tLen && pat.charAt(j) != txt.charAt(i)) {
                // Do not match lps[0..lps[j-1]] characters, they will match anyway
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
        return count;
    }

    public static void computeLPSArray(String pat, int pLen, int lps[]) {
        // length of the previous longest prefix suffix
        int len = 0;
        int i = 1;
        lps[0] = 0; // lps[0] is always 0

        // the loop calculates lps[i] for i = 1 to pLen-1
        while (i < pLen) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else { // (pat[i] != pat[len])
                // This is tricky. Consider the example. AAACAAAA and i = 7. The idea is similar to search step.
                if (len != 0) {
                    len = lps[len - 1];

                    // Also, note that we do not increment i here
                } else { // if (len == 0)
                    lps[i] = len;
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        PatternRecognition.searchPattern(";bcdefbcbebc|abcdebcfgsdf|cbdbesfbcy|1bcdef23423bc32");
        PatternRecognition.searchPattern("b;bcdefbcbebc|abcdebcfgsdf|cbdbesfbcy|1bcdef23423bc32");
        PatternRecognition.searchPattern("aa;aaaakjlhaa|aaadsaaa|easaaad|sa");
        PatternRecognition.searchPattern("bc;bcdefbcbebc|abcdebcfgsdf|cbdbesfbcy|1bcdef23423bc32");
    }

}
