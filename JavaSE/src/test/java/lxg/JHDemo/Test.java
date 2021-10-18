package lxg.JHDemo;

import com.lxg.JHDemo.Dog;
import com.lxg.JHDemo.Fanxing;
import com.lxg.JHDemo.Person;

import java.util.*;

/**
 * @author lxg
 * @description 集合框架测试类
 * @date 2021/9/4
 *
 *集合框架：
 *   Collection：存放的是单一值
 *        特点：
 *           1.可以存放不同类型的数据，数组只能存放固定类型的数据
 *           2.当使用ArrayList子类实现的时候，初始化长度是10，当长度不够的时候，会自动进行扩容操作，每一次扩容都会为原来的1.5倍
 *       方法：
 *          add: 要求必须传入的参数是Object对象，因此，当写入基本数据类型的时候，包含了自动拆箱和自动装箱的过程
 *          addAll:添加另一个集合的元素到此集合中
 *
 *          clean：只是清空集合中的元素，但是此集合对象没有被回收
 *          remove：删除指定元素
 *          removeAll：删除集合元素
 *
 *          contains：判断集合中是否包含指定的元素
 *          containsAll：判断此集合中是否包含另外一个集合
 *
 *
 *----接口 Collection:
 *     不唯一，无序
 *
 *   1.接口 list
 *     不唯一，有序
 *     api:
 *       add:添加元素
 *       addAll:将另一个list的数据添加到此list
 *       clean:清空list
 *       contains:判断是否包含指定元素
 *       containsAll:判断是否包含某list
 *       copyof:复制该list
 *       equals:比较两list是否相等
 *       hashCode:发牛哈希值
 *       indexOf:返回指定对象的位置
 *       isEmpty:判断是否为空
 *       iterater:返回一个遍历器
 *       size:返回list大小
 *       toArray:将list转化为数组
 *       set:更改指定位置上的元素
 *       get:获取指定位置上的元素
 *
 *     List的接口实现：
 *         ArrayList:
 *            -  实现了长度可变的数组，底层使用数组实现的
 *               可动态调整容量
 *               元素可以为null
 *               不同步、非线程安全、效率高
 *               查询块、增删慢
 *               占用空间更小，对比 LinkedList，不用占用额外空间维护链表结构
 *               每次扩容1.5倍
 *
 *            - 优点：遍历数组和随机访问效率高
 *            - 缺点：添加和删除需要移动大量元素，效率比较低，按照元素内容查询效率也低
 *
 *            api:
 *
 *
 *         LinkedList:
 *            - 采用链表的方式实现
 *            - 优点：插入、删除元素效率较高，只需要修改链表节点的指针位置，不需要移动元素
 *            - 缺点：遍历和随机访问效率低下
 *
 *            api:
 *              	add​(int index, E element)
 *              	add​(E e)
 *              	addAll​(int index, Collection<? extends E> c)
 *              	addAll​(Collection<? extends E> c)
 *                 	addFirst:添加头
 *                 	addLast：添加尾
 *                 	offerFirst 1.6版本之后的添加头
 *                 	offerLast：添加尾
 *                 	removeFirst:删除头
 *                 	removeLast:删除尾
 *                 	pollFirst:
 *                 	pollLast：
 *                 	getFirst:获取头
 *                 	getLast:获取尾巴
 *                 	peekFirst:
 *                 	peekLast:
 *
 *         Vector:
 *             - 底层使用数组实现
 *             - 相比于ArrayList,是线程安全的，效率低
 *             - 每次扩容2倍
 *
 *   2.接口 set
 *     - 唯一，无序(存入和取处的顺序不一致)
 *     - 操作数据的方法与List类似，Set接口不存在get方法
 *     - set不可以通过下标来获取元素，因为元素无序
 *     - 设置元素的时候，如果是自定义对象时，会自动查找对象中的equals和hashcode方法，如果没有，设置的是地址，所以需要比较的话，
 *       需要重写equals和hashcode
 *     - 树在操作元素的时候默认有排序操作的，如果是基本数据类型，自动比较，如果是引用类型，需要自定义比较器
 *          比较器分类：
 *             内部比较器：
 *                 定义在元素的类中，通过实现Comparable接口来进行实现。
 *             外部比较器：
 *                 定义在当前类中，通过实现Comparator接口来实现，但是要将该比较器传递到集合中
 *                 TreeSet treeSet = new TreeSet(new Test());
 *             注意：外部比较器可以定义成一个工具类，此时如果需要比较的规则一致的话，可以重复使用
 *                  内部比较器只有在使用此对象的比较时才能使用
 *                  如果两者同时存在，使用外部比较器
 *                  当使用比较器的时候，不适用equals方法
 *
 *
 *     set接口的实现：
 *        HashSet:
 *           - 底层是HashMap，采用HashTable哈希表存储结构
 *           - 优点： 添加速度快、查询速度快、删除速度快
 *           - 缺点： 无序
 *
 *           - LinkedHashSet:
 *                -- 采用哈希表存储结构，同时使用链表维护次序
 *                -- 有序（添加顺序）
 *
 *           - HashSet存入值相同的不同引用对象时，能够存入，如何解决不重复元素问题？
 *             -- 解决方法：重写equals方法和hashCode方法
 *
 *           - HashSet是如何保证元素的唯一性的？
 *             -- 通过两个方法来完成的，如果元素的hashCode相同，才会判断equals是否为true
 *                如果元素的hashCode不同，不会调用equals方法
 *
 *        TreeSet:
 *           - 底层是treeMap,采用二叉树（红黑树）的存储结构
 *           - 优点： 有序（排序后的升序），查询速度比List块
 *           - 缺点： 查询速度没有HashSet块
 *
 *
 *
 * ----接口Iterator：
 *    所有实现了Collection接口的的容器都有一个iterator方法，用以返回一个实现了Iterator接口的对象。
 *    Iterator对象承做迭代器，用以方便实现对容器内元素的遍历操作
 *    Iterator定义了如下方法：
 *       hasNext():判断是否还有元素没有被遍历
 *       next():返回游标当前位置的元素并将游标移动到下一个位置。
 *       remove：删除游标左面的元素，在执行next 之后改操作只能执行一次
 *
 *    在Java代码中包含三种循环
 *        do...while
 *        while
 *        for
 *
 *     还有一种增强for循环，可以简化循环的编写
 *      for (Object i:arrayList) {
 *             System.out.println(i);
 *         }
 *
 *    所有的集合类都默认是实现了Iterable接口，实现此接口意味着具备了增强for循环的能力，也就是for-each
 *    增强for循环本质上使用的也是iterator的功能
 *       方法：
 *          iterator()
 *          foreach()
 *    在iterator的方法中，要求返回一个Iterator的接口子类实例对象
 *      此接口中包含了
 *         hasNext()
 *         next()
 *     在使用iterator进行迭代的过程中，如果删除其中某个元素会报错，并发操作异常，因此，如果遍历的同时需要修改元素，建议使用ListIterator（）
 *     ListIterator提供了向前和向后两种遍历方式
 *         始终是通过cursor和lastret的指针来获取元素值及向下的遍历索引
 *         当使用向前遍历的时候必须保证指针在迭代器的结果，否者无法获取结果值
 *
 *
 * ---- 接口 Map：
 *   - key-value映射
 *
 *   基本api操作：
 *      put(k,v):添加
 *
 *   实现子类：
 *   1.HashMap
 *     - 数组-链表（1.7） 数组-链表-红黑树（1.8）
 *     - key无序 唯一  可为空（set）
 *     - Value无序 不唯一（Collection）
 *
 *     - HashMap跟HashTable的区别？
 *       -- 1.hashMap线程不安全，效率高，hashTable线程安全，效率低
 *       -- 2.hashmap中key和value都可以为空，hashtable不允许为空
 *
 *     - hashmap初始值为2的N次幂
 *
 *   2.LinkedMap
 *     - 链表
 *     - 有序的HashMap 速度快
 *
 *   3.TreeMap
 *     -  红黑树
 *     - 有序 速度没有hash块
 *     -
 *
 *
 */
public class Test implements Comparator<Person>{


    /*Map*/
    @org.junit.Test
    public void mapTest(){
        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",1);
        map.put("e",5);
        System.out.println(map);

        /*常用api*/
        map.put("f",8);
        map.isEmpty();
        map.clear();
        map.size();
        map.containsKey("a");
        map.containsValue(3);
        map.get("a");
        map.remove("a");

        //遍历操作
        //方式一
        Set<String> keys = map.keySet();
        for (String key:keys) {
            System.out.println(key+":"+map.get(key));
        }
        for(Iterator iterator = keys.iterator();iterator.hasNext();){
            System.out.println(map.get(iterator.next()));
        }


        //方式二
        Collection<Integer> values = map.values();
        for(Integer value:values){
            System.out.println(value);
        }
        /*for(Iterator iterator=values.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }*/

        /*
        * Map.Entry:表示的是k-v组合的一组映射关系，key和value成组出现
        * */
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        Iterator iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer> next = (Map.Entry<String, Integer>) iterator.next();
            System.out.println(next.getKey()+"--"+next.getValue());
        }

    }



    /*泛型：
    * 当做一些集合的同一操作的时候，需要保证集合的元素类型时统一的，此时需要泛型来限制
    * - 优点：
    *    1.数据安全
    *    2.获取数据时效率比较高
    *
    * - 给集合中的元素设置相同的类型就是泛型的基本需求
    *   使用：
    *     在定义对象的时候，通过<>中设置合理的类来进行实现
    *
    * - 泛型的高级应用:
    *   1.泛型类
    *     在定义类的时候，在类名的后面添加<E、K、V、A、B>等，起到占位的作用，类中的方法的返回值类型和属性都可以使用
    *   2.泛型接口
    *     在定义接口的时候，在接口名后面添加<E、K、V、A、B>等，起到占位的作用；
    *     1.子类在进行实现的时候，可以不填写泛型的类型，此时在创建具体的子类对象的时候才决定使用什么类型
    *     2.子类在实现泛型接口的时候，只在实现父类的接口的时候指定父类的泛型类型即可，此时，测试方法中的泛型类型必须跟子类泛型类型一致
    *   3.泛型方法
    *     在定义方法的时候，指定方法的参数或返回值是泛型是自定义的占位符，可以是类名中的T，也可以是自定义的Q，只不过在使用Q的时候，需要使用<Q>
          定义在返回值前面。
    *   4.泛型的上限
    *   5.泛型的下限
    *
    *
    * */
    @org.junit.Test
    public void fxTest(){
       /*存在问题演示*/
        List list = new ArrayList();
        list.add(1);
        list.add("abc");
        list.add(true);
        list.add(new Person("zhangsan",18));
        System.out.println(list);

        //要求：打印list中person的名字
        //使用for循环
        for (int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //for-each,问题：很难取出元素中的person类型
        for (Object o:list) {

            System.out.println(o);
        }

        /*------------------------------------------------------*/
        //测试泛型类
        //传String类型
        Fanxing<String> fanxing = new Fanxing<>();
        fanxing.setA("zhangsan");
        fanxing.setId(1);
        fanxing.show();

        //传Person类
        Fanxing<Person> fanxing1 = new Fanxing<>();
        fanxing1.setA(new Person("lisi",20));
        fanxing1.setId(2);
        fanxing1.show();

        //泛型接口

    }

    /*重写外部比较器，需要实现Comparator接口*/
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getAge()>o2.getAge()){
            return 1;
        }else if(o1.getAge()<o2.getAge()){
            return -1;
        }else{
            return 0;
        }
    }

    /*测试TreeSet*/
    @org.junit.Test
    public void treeSetTest(){
        TreeSet treeSet = new TreeSet(new Test()); //需要将比较器传递到集合中
        TreeSet treeSet1 = new TreeSet();
        /*常用api*/
        treeSet.add("lisi");
        treeSet.addAll(treeSet1);
        treeSet.ceiling("lisi");
        treeSet.clear();
        treeSet.clone();
        treeSet.comparator();
        treeSet.contains("lisi");
        treeSet.first();
        treeSet.isEmpty();
        treeSet.iterator();
        treeSet.remove("lisi");
        treeSet.size();



    }

    /*HashSet测试*/
    @org.junit.Test
    public void hashSetTest(){
        HashSet hashSet = new HashSet();

        /*常用api*/
        hashSet.add("lisi");
        hashSet.clear();
        hashSet.iterator();
        hashSet.size();
        hashSet.clone();
        hashSet.contains("lisi");
        hashSet.isEmpty();
        hashSet.remove("lisi");
        hashSet.equals(hashSet);
        hashSet.hashCode();
        hashSet.toArray();

    }

    /*测试Set*/
    @org.junit.Test
    public void setTest(){
        Set set = new HashSet();
        set.add("123");
        set.add(1);
        set.add(true);
        set.add("123");//重复数据
        System.out.println(set);  // [1, 123, true] 无序、唯一

        //两种打印set的方式
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //将while改为for循环
        for(Iterator iterator1 = set.iterator();iterator1.hasNext();) {
            System.out.println(iterator1.next());
        }

        set.add("lisi"); //添加
        set.clear();//清除
        set.hashCode();//返回哈希值
        set.size();//取大小
        set.contains("lisi");//判断是否包含指定元素
        set.containsAll(set);
        set.equals(set);
        set.isEmpty();
        set.remove("lisi");
        set.removeAll(set);
        set.retainAll(set);
        set.toArray();
    }

    /*Test Dog*/
    @org.junit.Test
    public void demoTest(){
        List list = new ArrayList();
        //添加狗的信息
        Dog d1 = new Dog("大黄","red");
        Dog d2 = new Dog("二黄","red");
        Dog d3 = new Dog("三黄","red");
        list.add(d1);
        list.add(d2);
        list.add(d3);
        System.out.println(list);
        System.out.println(list.size());
        list.remove(d1);
        System.out.println(list);
        System.out.println(list.contains(d2));
        Dog d4 = new Dog("二黄","red");
        System.out.println(list.contains(d4));

    }

    /*测试Iterator*/
    @org.junit.Test
    public void iteratorTest(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(9);

        System.out.println("普通for循环");
        for (int i = 0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        //迭代器
        System.out.println("迭代器");
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //增强for循环
        System.out.println("增强佛如循环");
        for (Object i:arrayList) {
            System.out.println(i);
        }
    }


    /*测试LinkedList*/
    @org.junit.Test
    public void linkedList(){
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add("dfcd");
        linkedList.add("vd");
        linkedList.add("a");
        linkedList.add("a");
        linkedList.add("vio");
        linkedList.add(10);
        System.out.println(linkedList);

    }

    /*测试List
    *存储对象不唯一，有序（插入数据的顺序）
   */
    @org.junit.Test
    public void listTest(){
        List list = new ArrayList();
        //插入数据
        list.add("a");
        list.add("b");
        list.add(1);
        list.add(3);
        list.add(4);
        list.add("a");
        System.out.println(list);
    }

    /*测试Collection*/
    @org.junit.Test
    public void CollectionTest(){
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(true);
        collection.add(1.23);
        collection.add("abc");
        System.out.println(collection);

        //在指定位置加入数据
        ((ArrayList)collection).add(0,"lxg");
        System.out.println(collection);

        //在一个集合后面增加另外一个集合
        Collection collection1 = new ArrayList();
        collection1.add("a");
        collection1.add("b");
        collection1.add("c");
        collection1.add("d");
        collection.addAll(collection1);
        System.out.println(collection);

        //清空集合中的元素
        Collection collection2 = new ArrayList();
        collection2.add(1);
        collection2.add(2);
        collection2.clear();
        System.out.println("collection2:"+ collection2);
        System.out.println(collection2);
    }



}
