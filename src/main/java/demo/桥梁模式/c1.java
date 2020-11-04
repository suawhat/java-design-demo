package demo.桥梁模式;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/4 5:13 下午
 * @company 红尘互娱创意文化
 */
public class c1 {

  public static void main(String[] args) {
    Hose hose=new Hose();
    HoseCompany hoseCompany=new HoseCompany(hose);
    hoseCompany.makeMoney();


  }

}
