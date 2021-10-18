# Oracle 11g的安装与卸载
## 一、安装
1、下载到Oracle11g安装包后，大家会看到两个压缩包，将两个报全部都进行解压：
![](https://www.hualigs.cn/image/60d4ab50317e4.jpg)
2、将win64_11gR2_database_2of2包中的components的内容替换到win64_11gR2_database_1of2中的相同目录下；
3、完成上述步骤后，软件的安装目录如下：双击setup.exe程序进行安装
![](https://www.hualigs.cn/image/60d4ab51bb261.jpg)
4、Oracle安装之后会检测环境，会提示不满足，点击是即可 
![](https://www.hualigs.cn/image/60d4ab5009662.jpg)     
5、填写邮件信息，此处不填写，将对勾取消
![](https://www.hualigs.cn/image/60d4ab523edbf.jpg)  

6、此处弹出警告信息，忽略即可
![](https://www.hualigs.cn/image/60d4ab53129d4.jpg)  
7、安装完成之后会自动创建数据库
![](https://www.hualigs.cn/image/60d4ab5265add.jpg)    
8、选择安装桌面类    
![](https://www.hualigs.cn/image/60d4ab5275331.jpg)

9、选择oracle的安装目录，一定要指定目录，否则修改配置文件麻烦
![](https://www.hualigs.cn/image/60d4ab54448f2.jpg)    
10、密码简单会提出警告信息，忽略即可
![](https://www.hualigs.cn/image/60d4ab5008db9.jpg)
11、提示oracle相关的配置信息，默认即可
![](https://www.hualigs.cn/image/60d4ab5323b48.jpg)
12、Oracle的安装过程，此过程会持续一段时间，耐心等待即可
![](https://www.hualigs.cn/image/60d4ab544d2a5.jpg)
13、安装进度条，耐心等待
![](https://www.hualigs.cn/image/60d4ab544baad.jpg)
14、安装完成之后显示oracle帮助，此时可以修改密码，一般我们不修改，选择在后续进行修改操作
![](https://www.hualigs.cn/image/60d4ab5179552.jpg)
15、在口令管理处可以修改密码，默认用户名是scott
![](https://www.hualigs.cn/image/60d4ab549046b.jpg)
16、Oracle安装成功   
![](https://www.hualigs.cn/image/60d4ab526148d.jpg)     

## 二、卸载    
1、 开始－＞设置－＞控制面板－＞管理工具－＞服务，停止所有Oracle服务。
![](https://www.hualigs.cn/image/60d4ae9818fe3.jpg)   
2、 开始－＞程序－＞Oracle_OraDB11g_Home1－＞OracleInstallation Products－＞Universal Installer，单击“卸载产品”-“全部展开”，选中除“OraDb11g_home1”外的全部目录，删除。
![](https://www.hualigs.cn/image/60d4ae985c168.jpg)
3、运行regedit，选择HKEY_LOCAL_MACHINE\SOFTWARE\ORACLE，按del键删除这个入口。    

4、运行regedit，选择HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services，滚动这个列表，删除所有Oracle入口(以oracle或OraWeb开头的键)。

5、运行refedit，HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\Eventlog\Application，删除所有Oracle入口。

6、 删除HKEY_CLASSES_ROOT目录下所有以Ora、Oracle、Orcl或EnumOra为前缀的键。

7、 删除
HKEY_CURRENT_USER\Software\Microsoft\Windows\CurrentVersion\Explorer\MenuOrder\StartMenu\Programs中所有以oracle开头的键。

8、删除HKEY_LOCAL_MACHINE\SOFTWARE\ODBC\ODBCINST.INI中除MicrosoftODBC for Oracle注册表键以外的所有含有Oracle的键。

9、我的电脑-->属性-->高级-->环境变量，删除环境变量CLASSPATH和PATH中有关Oracle的设定。
1
0、从桌面上、STARTUP（启动）组、程序菜单中，删除所有有关Oracle的组和图标。

11、删除所有与Oracle相关的目录(如果删不掉，重启计算机后再删就可以了)包括：
    
- C:\Program file\Oracle目录。

- ORACLE_BASE目录(oracle的安装目录)。

- C:\WINDOWS\system32\config\systemprofile\Oracle目录。

- C:\Users\Administrator\Oracle或C:\Documentsand Settings\Administrator\Oracle目录。

- C:\WINDOWS下删除以下文件ORACLE.INI、oradim73.INI、oradim80.INI、oraodbc.ini等等。

- C:\WINDOWS下的WIN.INI文件中若有[ORACLE]的标记段，删除该段。

12、如有必要，删除所有Oracle相关的ODBC的DSN

13、到事件查看器中，删除Oracle相关的日志 说明： 如果有个别DLL文件无法删除的情况，则不用理会，重新启动，开始新的安装，安装时，选择一个新的目录，则，安装完毕并重新启动后，老的目录及文件就可以删除掉了。