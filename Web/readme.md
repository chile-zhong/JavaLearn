# Web
## JavaWeb
    使用Java语言开发基于互联网的项目
## 软件架构
    - B/S架构
        只需要一个浏览器，用户通过不同的URL，访问不同的服务端程序
        优点：开发、安装、部署、维护简单
        缺点：
            如果应用过大，用户体验可能会受影响
            对硬件要求过高
    - C/S架构
        在用户本地有一个客户端程序，在远程有一个服务端程序
        优点：用户体验好
        缺点：开发、安装、部署、维护困难

## B/S架构详解
    资源分类
    1.静态资源
        - 使用静态网页开发技术发布的资源
        - 特点
            * 所有用户访问，得到的结果一样
            * 如：文本，图片，音频，视频 HTML，CSS，JavaScript
            * 如果用户请求的是静态资源，那么服务器会直接将静态资源发送给浏览器。
              浏览器中内置了静态资源的解析引擎，可以展示静态资源。
        - 静态三剑客：
            * HTML：用于搭建基础网页，展示页面内容
            * CSS：用于美化也米娜，布局页面
            * JavaScript：控制页面元素，让页面有一些动态效果
           
    2.动态资源
        - 使用动态网页发布的资源
        - 特点
            * 所有用户访问，得到的结果可能不一样
            * ru:jsp/servlet,php,asp...
            * 如果用户请求动态资源，那么服务器会执行动态资源
              转换为静态资源，再将静态资源发送给浏览器
## HTML
    1.概念
    超文本标记语言hyper text markup language
    超文本：
        超文本时用超链接的方式，将各种不同空间的文字信息组织在一起的网状文本
    标记语言：
        由标签构成的语言，如html,xml等
        标记语言不是编程语言
        
    2.语法
    
    3.标签
        文件标签:构成html最基本的标签
            html
            head
            title
            body
        文本标签
            <h1> -<h6>
            <p>
            <br>
            <hr>
            <b>
            <i>
            <font>
        图片标签
            <img />
        列表标签
            <ol>
                <li></li>
            </ol>
            <ol>
                <ul></ul>
            </ol>
            
        连接标签
            <a></a>
        表格标签
            <table>
                <tr>
                    <th></th>
                </tr>
                <tr>
                    <td></td>
                </tr>
            </table>
        块标签
            <div></div> 
            <span><span> 文本信息在一行内展示，行内标签，内联标签
        
        语义化标签,html5中的标签
            <header></header>
            <footer></footer>
            
        表单标签
            表单：
                用于采集用户输入的数据的。用于和服务器进行交互的。
            <form>
                
            </form>
            属性：
              action
              method：指定提交方式
                get:
                    1.请求参数会在地址栏中希纳是，会封装到请求行中
                    2.请求参数大小有限制
                    3.不太安全
                post:
                    1.请求参数不会在地址栏中显示，会封装到请求体中
                    2.请求参数大小没有限制
                    3.较为安全
                    
            表单中的数据需要提交，必须指定其name属性
            
            表单项：
                <input> :可以通过type属性，改变元素展示的样式
                    type值：
                        text:文本输入框 
                            placeholder:指定提示
                        password：密码框
                        radio单选框
                            1.要想让多个单选框实现单选的效果，则多个单选框的name属性值必须一样
                            2.一般会给每一个单选框提供value属性，指定其被选中后提交的值
                            3.checked属性，可以指定默认值
                        checkbox：复选框
                            1.一般会给每一个单选框提供value属性，指定其被选中后提交的值
                            2.checked属性，可以指定默认值
                        file:文本选择框
                        hidden：隐藏域
                        按钮：
                            submit：提交按钮，可以提交表单
                            button：普通按钮
                            image: 图片提交按钮 
                                src属性执行图片的路径
                        
                        
                    label:指定输入项的文字描述信息
                        label的for属性一般会和input的id属性值对应，
                        如果对应了，则点击label区域，会让input输入框获取焦点
                
                select：下拉列表
                    <select name="province">
                        <option value=“”>---请选择---</option>
                        <option value=“1”>北京</option>
                        <option value=“2”>上海</option>
                        <option value=“3”>天津</option>
                    </select>
                textarea:文本域
                    cols:指定行数
              
## CSS 
    1.概念：Cascading style sheets 层叠样式表
        层叠：多个样式可以作用在同一个html元素上，同时生效
    
    2.好处
        * 功能强大
        * 将内容展示和样式控制分离
            降低耦合度，解耦
            让分工协作更容易
            提高开发效率
    3.使用
        * 内联样式
            在表亲啊内部使用style属性执行css代码
            
        * 内部样式
            在head标签内，定义style标签，style内部定义css样式
            
        * 外部样式
            1.将CSS资源定义在外部文件中
            2.在head表签中定义link标签，引入外部样式文件
            
    4.语法
        * 格式
            选择器{
                属性名：属性值;
                ....
            }
    
    5.选择器
        分类
            * 基本选择器
                id选择器:
                    #id{}
                元素选择器:
                    标签名{}
                    id选择器优先级高于元素选择器
                类选择器:
                    .class属性值{}
             
            * 扩展选择器
                选择所有元素
                    *{}
                并集选择器
                    选择器1，选择器2{}
                子选择器
                    选择器1 选择器2{}
                父选择器
                    选择器1 > 选择器2{}
                属性选择器
                    元素名称 [属性=属性值]{}
                伪类选择器:选择一些元素具有的状态
    6.属性
  
## JavaScript
    1.概念：一门客户端脚本语言
    运行在客户端浏览器中的。每一个浏览器都有JavaScript的解析引擎
    脚本语言：不需要编译，直接可以被浏览器执行
    
    2.功能
        可以用来增强用户和html页面的交互过程，可以用来控制html元素，
        让页面有一些动态效果，增强用户的体验。
    
    3.ECMAScript：客户端脚本语言的标准
        1. 基本语法：
            1. 与html结合方式
                1. 内部JS：
                * 定义<script>，标签体内容就是js代码
            2. 外部JS：
                * 定义<script>，通过src属性引入外部的js文件
        
            * 注意：
            1. <script>可以定义在html页面的任何地方。但是定义的位置会影响执行顺序。
            2. <script>可以定义多个。
        2. 注释
            1. 单行注释：//注释内容
            2. 多行注释：/*注释内容*/
        3. 数据类型：
            1. 原始数据类型(基本数据类型)：
                1. number：数字。 整数/小数/NaN(not a number 一个不是数字的数字类型)
                2. string：字符串。 字符串  "abc" "a" 'abc'
                3. boolean: true和false
                4. null：一个对象为空的占位符
                5. undefined：未定义。如果一个变量没有给初始化值，则会被默认赋值为undefined
        					
            2. 引用数据类型：对象
        				
        4. 变量
            * 变量：一小块存储数据的内存空间
                * Java语言是强类型语言，而JavaScript是弱类型语言。
                    * 强类型：在开辟变量存储空间时，定义了空间将来存储的数据的数据类型。只能存储固定类型的数据
                    * 弱类型：在开辟变量存储空间时，不定义空间将来的存储数据类型，可以存放任意类型的数据。
            * 语法：
                * var 变量名 = 初始化值;
        				
                * typeof运算符：获取变量的类型。
                * 注：null运算后得到的是object
        
        5. 运算符
            1. 一元运算符：只有一个运算数的运算符
                ++，-- ， +(正号)  
                * ++ --: 自增(自减)
                * ++(--) 在前，先自增(自减)，再运算
                * ++(--) 在后，先运算，再自增(自减)
                * +(-)：正负号
                * 注意：在JS中，如果运算数不是运算符所要求的类型，那么js引擎会自动的将运算数进行类型转换
                * 其他类型转number：
                    * string转number：按照字面值转换。如果字面值不是数字，则转为NaN（不是数字的数字）
                    * boolean转number：true转为1，false转为0
        	2. 算数运算符
        		+ - * / % ...
        
        	3. 赋值运算符
        		= += -+....
        
        	4. 比较运算符
        		> < >= <= == ===(全等于)
        		* 比较方式
        	        1. 类型相同：直接比较
        	            * 字符串：按照字典顺序比较。按位逐一比较，直到得出大小为止。
        	        2. 类型不同：先进行类型转换，再比较
        	            * ===：全等于。在比较之前，先判断类型，如果类型不一样，则直接返回false
        					
        
        	5. 逻辑运算符
        		&& || !
        		* 其他类型转boolean：
        	        1. number：0或NaN为假，其他为真
        	        2. string：除了空字符串("")，其他都是true
        	        3. null&undefined:都是false
        	        4. 对象：所有对象都为true
        				
        	6. 三元运算符
        		? : 表达式
        		var a = 3;
        		var b = 4;
        			
        		var c = a > b ? 1:0;
        		* 语法：
        			* 表达式? 值1:值2;
        			* 判断表达式的值，如果是true则取值1，如果是false则取值2；
        				
        	7. 流程控制语句：
        		1. if...else...
        		2. switch:
        			* 在java中，switch语句可以接受的数据类型： byte int shor char,枚举(1.5) ,String(1.7)
        				* switch(变量):
        					case 值:
        				* 在JS中,switch语句可以接受任意的原始数据类型
        		3. while
        		4. do...while
        		5. for
        	8. JS特殊语法：
        		1. 语句以;结尾，如果一行只有一条语句则 ;可以省略 (不建议)
        		2. 变量的定义使用var关键字，也可以不使用
                    * 用： 定义的变量是局部变量
        	        * 不用：定义的变量是全局变量(不建议)
        
        	9. 练习：99乘法表
        			<!DOCTYPE html>
        			<html lang="en">
        			<head>
        			    <meta charset="UTF-8">
        			    <title>99乘法表</title>
        			    <style>
        			        td{
        			            border: 1px solid;
        			        }
        			
        			    </style>
        			
        			    <script>
        			
        			        document.write("<table  align='center'>");
        			
        			
        			        //1.完成基本的for循环嵌套，展示乘法表
        			        for (var i = 1; i <= 9 ; i++) {
        			            document.write("<tr>");
        			            for (var j = 1; j <=i ; j++) {
        			                document.write("<td>");
        			
        			                //输出  1 * 1 = 1
        			                document.write(i + " * " + j + " = " + ( i*j) +"&nbsp;&nbsp;&nbsp;");
        			
        			                document.write("</td>");
        			            }
        			            /*//输出换行
        			            document.write("<br>");*/
        			
        			            document.write("</tr>");
        			        }
        			
        			        //2.完成表格嵌套
        			        document.write("</table>");
        			
        			    </script>
        			</head>
        			<body>
        			
        			</body>
        			</html>
        2. 基本对象：
        	1. Function：函数(方法)对象
                1. 创建：
                    1. var fun = new Function(形式参数列表,方法体);  //忘掉吧
                    2. 
        	        function 方法名称(形式参数列表){
                        方法体
                    }
        
                    3. 
        	        var 方法名 = function(形式参数列表){
                        方法体
                    }
                2. 方法：
        
                3. 属性：
                    length:代表形参的个数
                4. 特点：
                     1. 方法定义是，形参的类型不用写,返回值类型也不写。
                     2. 方法是一个对象，如果定义名称相同的方法，会覆盖
                     3. 在JS中，方法的调用只与方法的名称有关，和参数列表无关
                     4. 在方法声明中有一个隐藏的内置对象（数组），arguments,封装所有的实际参数
                5. 调用：
                            方法名称(实际参数列表);
        			
        	2. Array:数组对象
                1. 创建：
                    1. var arr = new Array(元素列表);
                    2. var arr = new Array(默认长度);
                    3. var arr = [元素列表];
                2. 方法
                    join(参数):将数组中的元素按照指定的分隔符拼接为字符串
                    push()	向数组的末尾添加一个或更多元素，并返回新的长度。
                3. 属性
                    length:数组的长度
                4. 特点：
                    1. JS中，数组元素的类型可变的。
                    2. JS中，数组长度可变的。
        	3. Boolean
        	4. Date：日期对象
                1. 创建：
                     var date = new Date();
        
                2. 方法：
                     toLocaleString()：返回当前date对象对应的时间本地字符串格式
                     getTime():获取毫秒值。返回当前如期对象描述的时间到1970年1月1日零点的毫秒值差
        	5. Math：数学对象
                1. 创建：
                     * 特点：Math对象不用创建，直接使用。  Math.方法名();
        
                2. 方法：
                     random():返回 0 ~ 1 之间的随机数。 含0不含1
                     ceil(x)：对数进行上舍入。
                     floor(x)：对数进行下舍入。
                     round(x)：把数四舍五入为最接近的整数。
                3. 属性：
                     PI
        	6. Number
        	7. String
        	8. RegExp：正则表达式对象
        		1. 正则表达式：定义字符串的组成规则。
        			1. 单个字符:[]
        			    如： [a] [ab] [a-zA-Z0-9_]
        				* 特殊符号代表特殊含义的单个字符:
        				    \d:单个数字字符 [0-9]
        				    \w:单个单词字符[a-zA-Z0-9_]
        			2. 量词符号：
        				?：表示出现0次或1次
        				*：表示出现0次或多次
        				+：出现1次或多次
        				{m,n}:表示 m<= 数量 <= n
        				    * m如果缺省： {,n}:最多n次
        				    * n如果缺省：{m,} 最少m次
        			3. 开始结束符号
        				* ^:开始
        				* $:结束
        		2. 正则对象：
        			1. 创建
        				1. var reg = new RegExp("正则表达式");
        				2. var reg = /正则表达式/;
        			2. 方法	
        				1. test(参数):验证指定的字符串是否符合正则定义的规范	
        	9. Global
        		1. 特点：全局对象，这个Global中封装的方法不需要对象就可以直接调用。  方法名();
        		2. 方法：
        			encodeURI():url编码
        			decodeURI():url解码
        
        			encodeURIComponent():url编码,编码的字符更多
        			decodeURIComponent():url解码
        
        			parseInt():将字符串转为数字
        		        * 逐一判断每一个字符是否是数字，直到不是数字为止，将前边数字部分转为number
        			isNaN():判断一个值是否是NaN
        				* NaN六亲不认，连自己都不认。NaN参与的==比较全部问false
        
        				eval():将 JavaScript 字符串，并把它作为脚本代码来执行。			
    
    4.DOM
        * 功能：控制html文档的内容
        	* 获取页面标签(元素)对象：Element
        		* document.getElementById("id值"):通过元素的id获取元素对象
        
        	* 操作Element对象：
        		1. 修改属性值：
        			1. 明确获取的对象是哪一个？
        			2. 查看API文档，找其中有哪些属性可以设置
        		2. 修改标签体内容：
        			* 属性：innerHTML
        			1. 获取元素对象
        			2. 使用innerHTML属性修改标签体内容
        
        * 事件
            * 功能： 某些组件被执行了某些操作后，触发某些代码的执行。
            * 如何绑定事件
                1. 直接在html标签上，指定事件的属性(操作)，属性值就是js代码
                			1. 事件：onclick--- 单击事件
                2. 通过js获取元素对象，指定事件属性，设置一个函数
        
        * 概念： Document Object Model 文档对象模型
        		* 将标记语言文档的各个组成部分，封装为对象。可以使用这些对象，对标记语言文档进行CRUD的动态操作
        
        	* W3C DOM 标准被分为 3 个不同的部分：
                * 核心 DOM - 针对任何结构化文档的标准模型
        			* Document：文档对象
        			* Element：元素对象
        			* Attribute：属性对象
        			* Text：文本对象
        			* Comment:注释对象
        
        			* Node：节点对象，其他5个的父对象
        		* XML DOM - 针对 XML 文档的标准模型
        		* HTML DOM - 针对 HTML 文档的标准模型
        
        
        
        
        
        	* 核心DOM模型：
        		* Document：文档对象
        			1. 创建(获取)：在html dom模型中可以使用window对象来获取
        				1. window.document
        				2. document
        			2. 方法：
        				1. 获取Element对象：
        					1. getElementById()	： 根据id属性值获取元素对象。id属性值一般唯一
        					2. getElementsByTagName()：根据元素名称获取元素对象们。返回值是一个数组
        					3. getElementsByClassName():根据Class属性值获取元素对象们。返回值是一个数组
        					4. getElementsByName(): 根据name属性值获取元素对象们。返回值是一个数组
        				2. 创建其他DOM对象：
        					createAttribute(name)
                        	createComment()
                        	createElement()
                        	createTextNode()
        			3. 属性
        		* Element：元素对象
        			1. 获取/创建：通过document来获取和创建
        			2. 方法：
        				1. removeAttribute()：删除属性
        				2. setAttribute()：设置属性
        		* Node：节点对象，其他5个的父对象
        			* 特点：所有dom对象都可以被认为是一个节点
        			* 方法：
        				* CRUD dom树：
        					* appendChild()：向节点的子节点列表的结尾添加新的子节点。
        					* removeChild()	：删除（并返回）当前节点的指定子节点。
        					* replaceChild()：用新节点替换一个子节点。
        			* 属性：
        				* parentNode 返回节点的父节点。
        
        
        	* HTML DOM
        		1. 标签体的设置和获取：innerHTML
        		2. 使用html元素对象的属性
        		3. 控制元素样式
        			1. 使用元素的style属性来设置
        				如：
        					 //修改样式方式1
        			        div1.style.border = "1px solid red";
        			        div1.style.width = "200px";
        			        //font-size--> fontSize
        			        div1.style.fontSize = "20px";
        			2. 提前定义好类选择器的样式，通过元素的className属性来设置其class属性值。
    
    5.BOM
        1. 概念：Browser Object Model 浏览器对象模型
        		* 将浏览器的各个组成部分封装成对象。
        
        2. 组成：
        		* Window：窗口对象
        		* Navigator：浏览器对象
        		* Screen：显示器屏幕对象
        		* History：历史记录对象
        		* Location：地址栏对象
        
        3. Window：窗口对象
        	    1. 创建
        	    2. 方法
        	         1. 与弹出框有关的方法：
        	            alert()	显示带有一段消息和一个确认按钮的警告框。
        	            confirm()	显示带有一段消息以及确认按钮和取消按钮的对话框。
        	                * 如果用户点击确定按钮，则方法返回true
        	                * 如果用户点击取消按钮，则方法返回false
        	            prompt()	显示可提示用户输入的对话框。
        	                * 返回值：获取用户输入的值
        	         2. 与打开关闭有关的方法：
        	            close()	关闭浏览器窗口。
        	                * 谁调用我 ，我关谁
        	            open()	打开一个新的浏览器窗口
        	                * 返回新的Window对象
        	         3. 与定时器有关的方式
        	            setTimeout()	在指定的毫秒数后调用函数或计算表达式。
        	                * 参数：
        	                    1. js代码或者方法对象
        	                    2. 毫秒值
        	                * 返回值：唯一标识，用于取消定时器
        	            clearTimeout()	取消由 setTimeout() 方法设置的 timeout。
        	
        	            setInterval()	按照指定的周期（以毫秒计）来调用函数或计算表达式。
        	            clearInterval()	取消由 setInterval() 设置的 timeout。
        	
        	    3. 属性：
        	        1. 获取其他BOM对象：
        	            history
        	            location
        	            Navigator
        	            Screen:
        	        2. 获取DOM对象
        	            document
        	    4. 特点
        	        * Window对象不需要创建可以直接使用 window使用。 window.方法名();
        	        * window引用可以省略。  方法名();
        
        
        4. Location：地址栏对象
        		1. 创建(获取)：
        			1. window.location
        			2. location
        
        		2. 方法：
        			* reload()	重新加载当前文档。刷新
        		3. 属性
        			* href	设置或返回完整的 URL。
        
        
        5. History：历史记录对象
                1. 创建(获取)：
                    1. window.history
                    2. history
        
                2. 方法：
                    * back()	加载 history 列表中的前一个 URL。
                    * forward()	加载 history 列表中的下一个 URL。
                    * go(参数)	加载 history 列表中的某个具体页面。
                        * 参数：
                            * 正数：前进几个历史记录
                            * 负数：后退几个历史记录
                3. 属性：
                    * length	返回当前窗口历史列表中的 URL 数量。
        
## 事件监听机制：
	* 概念：某些组件被执行了某些操作后，触发某些代码的执行。	
		* 事件：某些操作。如： 单击，双击，键盘按下了，鼠标移动了
		* 事件源：组件。如： 按钮 文本输入框...
		* 监听器：代码。
		* 注册监听：将事件，事件源，监听器结合在一起。 当事件源上发生了某个事件，则触发执行某个监听器代码。


	* 常见的事件：
		1. 点击事件：
			1. onclick：单击事件
			2. ondblclick：双击事件
		2. 焦点事件
			1. onblur：失去焦点
			    一般用于表单校验
			2. onfocus:元素获得焦点。

		3. 加载事件：
			1. onload：一张页面或一幅图像完成加载。

		4. 鼠标事件：
			1. onmousedown	鼠标按钮被按下。
			2. onmouseup	鼠标按键被松开。
			3. onmousemove	鼠标被移动。
			4. onmouseover	鼠标移到某元素之上。
			5. onmouseout	鼠标从某元素移开。
			
			
		5. 键盘事件：
			1. onkeydown	某个键盘按键被按下。	
			2. onkeyup		某个键盘按键被松开。
			3. onkeypress	某个键盘按键被按下并松开。

		6. 选择和改变
			1. onchange	域的内容被改变。
			2. onselect	文本被选中。

		7. 表单事件：
			1. onsubmit	确认按钮被点击。
			2. onreset	重置按钮被点击。
			
## BootStrap
    1. 概念： 一个前端开发的框架，Bootstrap，来自 Twitter，是目前很受欢迎的前端框架。
        Bootstrap 是基于 HTML、CSS、JavaScript 的，它简洁灵活，使得 Web 开发更
        加快捷。
    	
    	* 框架:一个半成品软件，开发人员可以在框架基础上，在进行开发，简化编码。
    	* 好处：
    	    1. 定义了很多的css样式和js插件。我们开发人员直接可以使用这些样式和插件得到丰富的页面效果。
    		2. 响应式布局。
    			* 同一套页面可以兼容不同分辨率的设备。
    
    
    2. 快速入门
    		1. 下载Bootstrap
    		2. 在项目中将这三个文件夹复制
    		3. 创建html页面，引入必要的资源文件
    
    
    		<!DOCTYPE html>
    		<html lang="zh-CN">
    		<head>
    		    <meta charset="utf-8">
    		    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    		    <meta name="viewport" content="width=device-width, initial-scale=1">
    		    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    		    <title>Bootstrap HelloWorld</title>
    		
    		    <!-- Bootstrap -->
    		    <link href="css/bootstrap.min.css" rel="stylesheet">
    		
    		
    		    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    		    <script src="js/jquery-3.2.1.min.js"></script>
    		    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    		    <script src="js/bootstrap.min.js"></script>
    		</head>
    		<body>
    		<h1>你好，世界！</h1>
    		
    		</body>
    		</html> 

## 响应式布局
	* 同一套页面可以兼容不同分辨率的设备。
	* 实现：依赖于栅格系统：将一行平均分成12个格子，可以指定元素占几个格子
	* 步骤：
		1. 定义容器。相当于之前的table、
			* 容器分类：
				1. container：两边留白
				2. container-fluid：每一种设备都是100%宽度
		2. 定义行。相当于之前的tr   样式：row
		3. 定义元素。指定该元素在不同的设备上，所占的格子数目。样式：col-设备代号-格子数目
			* 设备代号：
				1. xs：超小屏幕 手机 (<768px)：col-xs-12
				2. sm：小屏幕 平板 (≥768px)
				3. md：中等屏幕 桌面显示器 (≥992px)
				4. lg：大屏幕 大桌面显示器 (≥1200px)

		* 注意：
			1. 一行中如果格子数目超过12，则超出部分自动换行。
			2. 栅格类属性可以向上兼容。栅格类适用于与屏幕宽度大于或等于分界点大小的设备。
			3. 如果真实设备宽度小于了设置栅格类属性的设备代码的最小值，会一个元素沾满一整行。

## CSS样式和JS插件
	1. 全局CSS样式：
		* 按钮：class="btn btn-default"
		* 图片：
			*  class="img-responsive"：图片在任意尺寸都占100%
			*  图片形状
				*  <img src="..." alt="..." class="img-rounded">：方形
				*  <img src="..." alt="..." class="img-circle"> ： 圆形
				*  <img src="..." alt="..." class="img-thumbnail"> ：相框
		* 表格
			* table
			* table-bordered
			* table-hover
		* 表单
			* 给表单项添加：class="form-control" 
	2. 组件：
		* 导航条
		* 分页条
	3. 插件：
		* 轮播图

## 案例
	<!DOCTYPE html>
	<html lang="zh-CN">
	<head>
	    <meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
	    <title>Bootstrap HelloWorld</title>
	
	    <!-- Bootstrap -->
	    <link href="css/bootstrap.min.css" rel="stylesheet">
	
	
	    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
	    <script src="js/jquery-3.2.1.min.js"></script>
	    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
	    <script src="js/bootstrap.min.js"></script>
	    <style>
	        .paddtop{
	            padding-top: 10px;
	        }
	        .search-btn{
	            float: left;
	            border:1px solid #ffc900;
	            width: 90px;
	            height: 35px;
	            background-color:#ffc900 ;
	            text-align: center;
	            line-height: 35px;
	            margin-top: 15px;
	        }
	
	        .search-input{
	            float: left;
	            border:2px solid #ffc900;
	            width: 400px;
	            height: 35px;
	            padding-left: 5px;
	            margin-top: 15px;
	        }
	        .jx{
	            border-bottom: 2px solid #ffc900;
	            padding: 5px;
	        }
	        .company{
	            height: 40px;
	            background-color: #ffc900;
	            text-align: center;
	            line-height:40px ;
	            font-size: 8px;
	        }
	    </style>
	</head>
	<body>
	
	   <!-- 1.页眉部分-->
	   <header class="container-fluid">
	       <div class="row">
	           <img src="img/top_banner.jpg" class="img-responsive">
	       </div>
	       <div class="row paddtop">
	           <div class="col-md-3">
	               <img src="img/logo.jpg" class="img-responsive">
	           </div>
	           <div class="col-md-5">
	               <input class="search-input" placeholder="请输入线路名称">
	               <a class="search-btn" href="#">搜索</a>
	           </div>
	           <div class="col-md-4">
	               <img src="img/hotel_tel.png" class="img-responsive">
	           </div>
	
	       </div>
	       <!--导航栏-->
	       <div class="row">
	           <nav class="navbar navbar-default">
	               <div class="container-fluid">
	                   <!-- Brand and toggle get grouped for better mobile display -->
	                   <div class="navbar-header">
	                       <!-- 定义汉堡按钮 -->
	                       <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
	                           <span class="sr-only">Toggle navigation</span>
	                           <span class="icon-bar"></span>
	                           <span class="icon-bar"></span>
	                           <span class="icon-bar"></span>
	                       </button>
	                       <a class="navbar-brand" href="#">首页</a>
	                   </div>
	
	                   <!-- Collect the nav links, forms, and other content for toggling -->
	                   <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	                       <ul class="nav navbar-nav">
	                           <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
	                           <li><a href="#">Link</a></li>
	                           <li><a href="#">Link</a></li>
	                           <li><a href="#">Link</a></li>
	                           <li><a href="#">Link</a></li>
	                           <li><a href="#">Link</a></li>
	
	                       </ul>
	                   </div><!-- /.navbar-collapse -->
	               </div><!-- /.container-fluid -->
	           </nav>
	
	       </div>
	
	       <!--轮播图-->
	       <div class="row">
	           <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
	               <!-- Indicators -->
	               <ol class="carousel-indicators">
	                   <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
	                   <li data-target="#carousel-example-generic" data-slide-to="1"></li>
	                   <li data-target="#carousel-example-generic" data-slide-to="2"></li>
	               </ol>
	
	               <!-- Wrapper for slides -->
	               <div class="carousel-inner" role="listbox">
	                   <div class="item active">
	                       <img src="img/banner_1.jpg" alt="...">
	                   </div>
	                   <div class="item">
	                       <img src="img/banner_2.jpg" alt="...">
	                   </div>
	                   <div class="item">
	                       <img src="img/banner_3.jpg" alt="...">
	                   </div>
	
	               </div>
	
	               <!-- Controls -->
	               <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
	                   <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
	                   <span class="sr-only">Previous</span>
	               </a>
	               <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
	                   <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
	                   <span class="sr-only">Next</span>
	               </a>
	           </div>
	
	
	
	       </div>
	
	   </header>
	   <!-- 2.主体部分-->
	   <div class="container">
	        <div class="row jx">
	            <img src="img/icon_5.jpg">
	            <span>黑马精选</span>
	        </div>
	
	       <div class="row paddtop">
	           <div class="col-md-3">
	                <div class="thumbnail">
	                    <img src="img/jiangxuan_3.jpg" alt="">
	                    <p>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</p>
	                    <font color="red">&yen; 699</font>
	                </div>
	           </div>
	           <div class="col-md-3">
	               <div class="thumbnail">
	                   <img src="img/jiangxuan_3.jpg" alt="">
	                   <p>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</p>
	                   <font color="red">&yen; 699</font>
	               </div>
	
	           </div>
	           <div class="col-md-3">
	
	               <div class="thumbnail">
	                   <img src="img/jiangxuan_3.jpg" alt="">
	                   <p>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</p>
	                   <font color="red">&yen; 699</font>
	               </div>
	           </div>
	           <div class="col-md-3">
	
	               <div class="thumbnail">
	                   <img src="img/jiangxuan_3.jpg" alt="">
	                   <p>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</p>
	                   <font color="red">&yen; 699</font>
	               </div>
	           </div>
	
	
	       </div>
	       <div class="row jx">
	           <img src="img/icon_6.jpg">
	           <span>国内游</span>
	       </div>
	       <div class="row paddtop">
	           <div class="col-md-4">
	               <img src="img/guonei_1.jpg">
	           </div>
	           <div class="col-md-8">
	               <div class="row">
	                   <div class="col-md-4">
	                       <div class="thumbnail">
	                           <img src="img/jiangxuan_3.jpg" alt="">
	                           <p>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</p>
	                           <font color="red">&yen; 699</font>
	                       </div>
	                   </div>
	                   <div class="col-md-4">
	                       <div class="thumbnail">
	                           <img src="img/jiangxuan_3.jpg" alt="">
	                           <p>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</p>
	                           <font color="red">&yen; 699</font>
	                       </div>
	
	                   </div>
	                   <div class="col-md-4">
	
	                       <div class="thumbnail">
	                           <img src="img/jiangxuan_3.jpg" alt="">
	                           <p>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</p>
	                           <font color="red">&yen; 699</font>
	                       </div>
	                   </div>
	
	               </div>
	               <div class="row">
	                   <div class="col-md-4">
	                       <div class="thumbnail">
	                           <img src="img/jiangxuan_3.jpg" alt="">
	                           <p>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</p>
	                           <font color="red">&yen; 699</font>
	                       </div>
	                   </div>
	                   <div class="col-md-4">
	                       <div class="thumbnail">
	                           <img src="img/jiangxuan_3.jpg" alt="">
	                           <p>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</p>
	                           <font color="red">&yen; 699</font>
	                       </div>
	
	                   </div>
	                   <div class="col-md-4">
	
	                       <div class="thumbnail">
	                           <img src="img/jiangxuan_3.jpg" alt="">
	                           <p>上海直飞三亚5天4晚自由行(春节预售+亲子/蜜月/休闲游首选+豪华酒店任选+接送机)</p>
	                           <font color="red">&yen; 699</font>
	                       </div>
	                   </div>
	
	
	               </div>
	
	           </div>
	
	       </div>
	   </div>
	   <!-- 3.页脚部分-->
	   <footer class="container-fluid">
	       <div class="row">
	           <img src="img/footer_service.png" class="img-responsive">
	       </div>
	       <div class="row company">
	           江苏传智播客教育科技股份有限公司 版权所有Copyright 2006-2018, All Rights Reserved 苏ICP备16007882
	       </div>
	
	   </footer>
	
	
	</body>
	</html> 