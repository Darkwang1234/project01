package HelloWorld;

public class TemplatesTest {

    //模板六：prsf:可生成private static final
    private static final  HelloWorld cust = new HelloWorld();

    //模板一：psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("hello!");

        //变形:soutp / soutm /souty / xxx.out /
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        System.out.println("args = " + args);

        int num = 10;
        System.out.println("num = " + num);

        //模板三：fori
        String[] arr = new String[]{"Tom","Jerry","HanMeimei","Lilei"};
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

        //变形:iter
        for(String s:arr){
            System.out.println(s);
        }

        //变形：itar
        for(int i = 0; i<arr.length;i++){
            String s = arr[i];
            System.out.println(s);
        }
    }


}
