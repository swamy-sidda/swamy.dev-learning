package strings;

class Permutation
{
    static int count=0;
    public static void main(String[] ar)
    {
        String s="abcd";
        for(int i=0;i<3;i++){
            String s1=swap(s,0,i);
            for(int j=1;j<=3;j++){
                String s2=swap(s1,1,j);
                for(int k=2;k<=3;k++){
                    String s3=swap(s2,2,k);
                    System.out.println(s3);
                }
            }
        }
    }
    public static String swap(String s,int i,int j)
    {
        char[] a=s.toCharArray();
        char temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        return new String(a);
    }
}
