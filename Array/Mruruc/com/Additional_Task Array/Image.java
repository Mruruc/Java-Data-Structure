package Additional_Task;

public class Image {
/*    public static void main(String[] args) {
        int width=4, height=3;
        int [][][] pixels= new int [height][width][4];
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                for (int k = 0; k < pixels[i][j].length; k++) {
                    pixels[i][j][k]=(int)(Math.random()*255);
                }
            }
        }
        show(pixels);
        pixels=toGreyScale(pixels);
        System.out.println();
        show(pixels);
        pixels=rotateLeft(pixels);
        show(pixels);
    }

    public static void show(int [][][] pixels){
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                System.out.print("[ ");
                for (int k = 0; k < pixels[i][j].length; k++) {
                    System.out.print(pixels[i][j][k]+" ");
                }
                System.out.print("]");
            }
            System.out.println();
        }
    }

    public static int[][][] toGreyScale(int [][][] pixels){
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                int avg = (pixels[i][j][0]+pixels[i][j][1]+pixels[i][j][2])/3;
                for (int k = 0; k < pixels[i][j].length-1; k++) {
                    pixels[i][j][k]=avg;
                }
            }
        }
        return pixels;
    }

    public static int[][][] rotateLeft(int[][][] pixels){
        int [][][] res=new int[pixels[0].length][pixels.length][4];
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                res[j][i]=pixels[i][j];
            }
        }
        for (int i = 0; i < res.length/2; i++) {
            int[][] help=res[i];
            res[i]=res[res.length-1-i];
            res[res.length-1-i]=help;
        }
        return res;
    }


    public static int[][][] flipHorizontal(int [][][] pixels){
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                int [] help=pixels[i][j];
                pixels[i][j]=pixels[i][pixels[i].length-1-j];
                pixels[i][pixels[i].length-1-j]=help;
            }
        }
        return pixels;
    }*/



}
