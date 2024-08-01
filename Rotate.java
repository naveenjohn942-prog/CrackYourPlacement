class Rotate {
    public void rotate(int[][] matrix) {
        int cs=0,i=0;
        int[][] arr = new int[matrix.length][matrix.length];
        while(cs<arr.length&&i<matrix.length){
            int re=matrix.length-1;
            int j=0;
            while(re>=0&&j<matrix.length){
                arr[i][j]=matrix[re][cs];
                j++;
                re--;
            }
            cs++;
            i++;

        }
        for(int k=0;k<matrix.length;k++){
            for(int m=0;m<matrix.length;m++){
                matrix[k][m]=arr[k][m];
            }
        }
    }
}
