
class Solution {
    public String convert(String s, int numRows) {
            var l = s.length();
            if (l <= numRows || numRows == 1) {
                // special case when we don't need to do anything
                return s;
            }

            var source = s.toCharArray();
            var result = new char[l];
            var numDiagonals = numRows - 2;
            var numInSection = numRows + numDiagonals;

            var j = 0;
            for (int r = 0; r < numRows; r += 1) {
                var i = r;
                while (i < l) {
                    result[j] = source[i];
                    j += 1;
                    i += numInSection;
                    if (r > 0 && r < numRows - 1 && i - r * 2 < l) {
                        result[j] = source[i - r * 2];
                        j += 1;
                    }
                }
            }


            return new String(result);        
    }
}
