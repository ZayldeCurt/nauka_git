package blok2PodstawyAlgorytmow.mazeSolver;

public class MazeSolver {
    public static void main(String[] args) {
        int[][] maze1 = {
                {1,0,1,1},
                {1,0,0,1},
                {1,1,0,1}};
        int[][] maze2 = {
                {1,0,1,1,1,1},
                {1,0,0,0,0,1},
                {1,1,0,1,0,1},
                {1,0,0,1,0,0},
                {1,1,0,1,0,1},
                {1,1,1,1,0,1}};



//        solveMaze(maze1);
        rightHand(maze2);
    }

    public static void solveMaze(int[][] maze){
        int x = findStart(maze[0]);
        int y = 0;

        System.out.println(y+" : "+x);
    }

    public static void rightHand(int[][] maze){
        Integer x = findStart(maze[0]);
        Integer y = 0;
        System.out.println(y+" : "+x);
        int direction=0;
        int[] tempDate;

        while(y!=(maze.length-1)){

            tempDate=checkRightHand(maze,x,y,direction);
            direction=tempDate[0];
            x=tempDate[1];
            y=tempDate[2];
            System.out.println(y+" : "+x);
        }
    }

    public static void rightHandSHIT(int[][] maze){ //not working shit
        Integer x = findStart(maze[0]);
        Integer y = 0;
        int dir=0;
        while(y!=(maze.length-1)){
//            dir=checkRightHand(maze,x,y,dir);
            System.out.println(y+" : "+x);
            int temp=0+dir;
            while(temp<4){  //TODO ciekawe czy to dziala nie testowane
                switch(temp%4){
                    case 0:
                        if(maze[y][x-1]==0){
                            x--;
                            dir=0;
                        }
                        break;
                    case 1:
                        if(maze[y+1][x]==0){
                            y++;
                            dir=1;
                        }
                        break;
                    case 2:
                        if(maze[y][x+1]==0){
                            x++;
                            dir=2;
                        }
                        break;
                    case 3:
                        if(maze[y-1][x]==0){
                            y--;
                            dir=3;
                        }
                        break;
                    default:
                        System.out.println("error in checkRighrHand");
                }
                temp++;

            }



        }
    }

    public static int[] checkRightHand(int[][] maze,Integer x, Integer y,int direction){
        int temp=0+direction;
//        while(temp<4){
        for (int i = 0; i < 4; i++) {
            switch(temp%4){
                case 0:
                    if(maze[y][x-1]==0){
                        x--;
                        int[] actualdirection={3,x,y};
                        return actualdirection;
                    }
                    break;
                case 1:
                    if(maze[y+1][x]==0){
                        y++;
                        int[] actualdirection={0,x,y};
                        return actualdirection;
                    }
                    break;
                case 2:
                    if(maze[y][x+1]==0){
                        x++;
                        int[] actualdirection={1,x,y};
                        return actualdirection;
                    }
                    break;
                case 3:
                    if(maze[y-1][x]==0){
                        y--;
                        int[] actualdirection={2,x,y};
                        return actualdirection;
                    }
                    break;
                default:
                    System.out.println("error in checkRighrHand");
            }
            temp++;

        }
        System.out.println("error out while");
        int[] actualdirection={0,0,0};
        return actualdirection;
    }

    public static int findStart(int[] maze){
        int i=0;
        while(maze[i]!=0){
            i++;
        }
        return i;
    }
}
