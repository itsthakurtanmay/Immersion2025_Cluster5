class question1 {
    public int removeElement(int[] nums, int val) {
        //Arraylist;
        ArrayList<Integer>al = new ArrayList<>();

        //arraylist ke andar not equal to val waale elements add karo;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != val)al.add(nums[i]);
        }
        //Copy back to main array -> Reason : Array in-place;
        for(int i = 0;i<al.size();i++){
            nums[i] = al.get(i);
        }
        return al.size();
        
    }
}