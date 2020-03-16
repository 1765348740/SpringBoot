/**
 * @program: spring-boot-maven
 * @author: 拉普拉斯妖
 * @Date: 2020/3/10 21:59
 * @Description:
 */
public class test {
    public static void main(String[] args) {
       int x=1,y=0;
       switch (x){
           case 1:
               switch (y){
                   case 0:System.out.print("frist\n");break;
                   case 1:System.out.print("second\n");break;
               }break;
           case 2:System.out.print("thd\n");
       }
    }


}
