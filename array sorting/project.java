class project{
    public static void main(String []args){
        int[] a = {1,2,0,0,1,2};
        for (int i=0;i<a.length;i++){
            if (i == a.length-1){
                System.out.print(a[i]);
            }else{
                System.out.print(a[i]+",");
            }
        }
        for (int i=0;i<a.length-1;i++){
            for (int j=i+1;j<a.length-1;j++){
                if (a[i] > a[j]){
                    int temp;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println();
        for (int i=0;i<a.length;i++){
            if (i == a.length-1){
                System.out.print(a[i]);
            }else{
                System.out.print(a[i]+",");
            }
        }
    }
}