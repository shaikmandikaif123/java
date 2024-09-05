class Hello
    {
        public static void main(String[] args)
                {
                    // System.out.println(3+2);
                    // int b=10;
                    // float a=3.4f;
                    // boolean c =true;
                    // double result = a+b;

                    int a = 10;
                    int b = 20;

                     a = a^b;
                     b=a^b;
                     a=a^b;
                    System.out.println(a);
                    System.out.print(b);
                }
    }