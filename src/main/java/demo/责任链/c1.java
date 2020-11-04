package demo.责任链;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author ly
 * @version 1.0
 * @date 2020/11/2 3:28 下午
 * @company 红尘互娱创意文化
 */
public class c1 {

  public static void main(String[] args) {
    Random random=new Random();

    ArrayList<IWomen> arrayList=new ArrayList<>();

    for (int i=0;i<5;i++){
      arrayList.add(new Women(random.nextInt(3),"逛街"));
    }

    Handler father =new Father();
    Handler husband =new Husband();

    father.setNextHandler(husband);
    for (IWomen iWomen:arrayList){
      father.HandleMessage(iWomen);
    }
  }

}
