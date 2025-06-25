class question1 {
    public int removeElement(int[] nums, int val) {
        //Create a new ArrayList;
        ArrayList<Integer>al = new ArrayList<>();

        //copy kardo arraylist ke andar -> Array's element except val;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != val)al.add(nums[i]);
        }

        //ArrayList se nums waaale array mein element copy kardo;
        for(int i = 0;i<al.size();i++){
            nums[i]  = al.get(i);
        }

        System.out.println(al);
        return al.size();
        
    }
}