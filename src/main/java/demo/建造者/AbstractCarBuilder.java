package demo.建造者;

import java.util.ArrayList;

/**
 * @author ly
 * @version 1.0
 * @date 2020/10/31 11:42 下午
 * @company 红尘互娱创意文化
 */
public abstract class AbstractCarBuilder {

  public abstract void setSequence(ArrayList<String> sequence);

  public abstract CarModel getCarModel();

}
