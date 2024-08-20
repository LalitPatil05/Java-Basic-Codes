class CommandLineArgument{
    public static void main(String args[]){

        int i;
        int count = 0;

        for(i=0 ; i<args.length ; i++){
           count = count + Integer.parseInt(args[i]);
        }

        System.out.println("Sum is : "+count);

        }
    }
