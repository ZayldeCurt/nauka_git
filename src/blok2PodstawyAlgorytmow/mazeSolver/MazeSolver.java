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
        rightHand(maze1);
    }

    public static void solveMaze(int[][] maze){
        int x = findStart(maze[0]);
        int y = 0;

        System.out.println(y+" : "+x);
    }

    public static void rightHand(int[][] maze){
        Integer x = findStart(maze[0]);
        Integer y = 0;
        int direction=100;
        while(y!=(maze.length-1)){
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
    public static int checkRightHand(int[][] maze,Integer x, Integer y,int direction){
        int temp=0+direction;
        int actualdirection=0;
        while(temp<4){  //TODO ciekawe czy to dziala nie testowane
            switch(temp%4){
                case 0:
                    if(maze[y][x-1]==0){
                        x--;
                        actualdirection=0;
                        return actualdirection;
                    }
                    break;
                case 1:
                    if(maze[y+1][x]==0){
                        y++;
                        actualdirection=1;
                        return actualdirection;
                    }
                    break;
                case 2:
                    if(maze[y][x+1]==0){
                        x++;
                        actualdirection=2;
                        return actualdirection;
                    }
                    break;
                case 3:
                    if(maze[y-1][x]==0){
                        y--;
                        actualdirection=3;
                        return actualdirection;
                    }
                    break;
                default:
                    System.out.println("error in checkRighrHand");
            }
            temp++;

        }
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
