class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int v=n*m;
        int arr[]=new int[v];
        int h=0;
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[h++]=grid[i][j];
            }
        }
        k=k%v;
       rev(arr,0,v-1);
       rev(arr,0,k-1);
       rev(arr,k,v-1);
     
       int l1=0;
       for(int i=0;i<n;i++){
        List<Integer> li=new ArrayList<>();
        for(int j=0;j<m;j++){
            li.add(arr[l1]);
            l1++;
        }
        l.add(li);
       }
  return l;
    }
    public static void rev(int []arr,int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
