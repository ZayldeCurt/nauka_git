package roznice_java_c;

public class choinka {



    public static void main(String[] args) {

        System.out.println(tree2Builder(20));
    }

    public static String tree2Builder(int height)
    {
        StringBuilder treeBuilder = new StringBuilder();
        String tree = "";
        for(int i=0;i<height;i++)
        {
            for(int j=0;j<height-1-i;j++)
            {
                treeBuilder.append(" ");
            }
            for (int j=0;j<2*i+1;j++)
            {
                treeBuilder.append("*");
            }

            treeBuilder.append("\n");
        }

        return treeBuilder.toString();
    }


    public static String tree(int height)
    {
        String tree = "";
        for(int i=0;i<height;i++)
        {
            for(int j=0;j<height-1-i;j++)
            {
                tree+=" ";
            }
            for (int j=0;j<2*i+1;j++)
            {
                tree+="*";
            }

            tree+="\n";
        }

        return tree;
    }

}
