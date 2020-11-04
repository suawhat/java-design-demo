package demo.工厂;

/**
 * @author ly
 * @version 1.0
 * @date 2020/10/31 10:37 下午
 * @company 红尘互娱创意文化
 */
public class HumanFactory extends AbstractHumanFactory{

  @Override
  <T extends Human> T createHuman(Class<T> c) {
    Human human=null;
    try {
      human= (T) Class.forName(c.getName()).newInstance();

    }catch (Exception e){
       e.printStackTrace();
    }
    return (T)human;
  }

  public static void main(String[] args) {
    AbstractHumanFactory abstractHumanFactory=new HumanFactory();
    WhiteHuman whiteHuman= abstractHumanFactory.createHuman(WhiteHuman.class);
    whiteHuman.getColor();
    whiteHuman.talk();

  }
}
