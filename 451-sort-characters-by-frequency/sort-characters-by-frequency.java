class Solution {
    public String frequencySort(String s) {
        StringBuilder sb=new StringBuilder();
        Map<Character, Integer> map=new HashMap<>();
        List<Character>[] arr=new ArrayList[s.length()+1];
        for(char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for (char key : map.keySet()) {
            int frequency = map.get(key);
            if (arr[frequency] == null) {
                arr[frequency] = new ArrayList<>();
            }
            arr[frequency].add(key);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != null) {
                for (char c : arr[i]) {
                    for (int j = 0; j < i; j++) {
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}