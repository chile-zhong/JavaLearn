#  Spring 概 述

## **1. 什 么 是 spring?**

> Spring 是 个 java 企 业 级 应 用 的 开 源 开 发 框 架 。Spring主 要 用 来 开 发 Java 应 用 ， 但 是 有 些 扩 展 是 针 对 构 建J2EE 平 台 的 web 应 用 。Spring 框 架 目 标 是 简 化 Java企 业 级 应 用 开 发 ， 并 通 过 POJO 为 基 础 的 编 程 模 型 促 进良 好 的 编 程 习 惯 。

## **2. 使 用 Spring 框 架 的 好 处 是 什 么 ？**

>  **轻 量 ：**Spring 是 轻 量 的 ， 基 本 的 版 本 大 约 2MB。 

>  **控 制 反 转 ：**Spring 通 过 控 制 反 转 实 现 了 松 散 耦 合 ， 对 象们 给 出 它 们 的 依 赖 ， 而 不 是 创 建 或 查 找 依 赖 的 对 象 们 。

>  **面 向 切 面 的 编 程(AOP)：**Spring 支 持 面 向 切 面 的 编 程 ，并 且 把 应 用 业 务 逻 辑 和 系 统 服 务 分 开 。

>  **容 器 ：**Spring 包 含 并 管 理 应 用 中 对 象 的 生 命 周 期 和 配置 。

>  **MVC 框 架**：Spring 的 WEB 框 架 是 个 精 心 设 计 的 框 架 ，是 Web 框 架 的 一 个 很 好 的 替 代 品 。

>  **事 务 管 理 ：**Spring 提 供 一 个 持 续 的 事 务 管 理 接 口 ， 可 以扩 展 到 上 至 本 地 事 务 下 至 全 局 事 务 （JTA） 。

>  **异 常 处 理 ：**Spring 提 供 方 便 的 API 把 具 体 技 术 相 关 的 异常 （ 比 如 由 JDBC，Hibernate or JDO 抛 出 的 ） 转 化 为一 致 的 unchecked 异 常 。

## **3. Spring 由 哪 些 模 块 组 成?**

![Spring体系结构](E:\IDEAWorkspace\JavaLearn\Spring\img\Spring体系结构.png)

 Core module

 Bean module

 Context module

 Expression Language module

 JDBC module

 ORM module

 OXM module

 Java Messaging Service(JMS) module

 Transaction module

 Web module

 Web-Servlet module

 Web-Struts module

 Web-Portlet module

## **4. 核 心 容 器 （ 应 用 上 下 文) 模 块 。**

> 这 是 基 本 的 Spring 模 块 ， 提 供 spring 框 架 的 基 础 功能 ，BeanFactory 是 任 何 以 spring 为 基 础 的 应 用 的 核心 。Spring 框 架 建 立 在 此 模 块 之 上 ， 它 使 Spring 成 为一 个 容 器 。

## **5. BeanFactory – BeanFactory 实 现 举 例 。**

> Bean 工 厂 是 工 厂 模 式 的 一 个 实 现 ， 提 供 了 控 制 反 转 功能 ， 用 来 把 应 用 的 配 置 和 依 赖 从 正 真 的 应 用 代 码 中 分离 。最 常 用 的 BeanFactory 实 现 是 XmlBeanFactory 类 。

## **6. XMLBeanFactory**

> 最 常 用 的 就 是org.springframework.beans.factory.xml.XmlBeanFactory ， 它 根 据 XML 文 件 中 的 定 义 加 载 beans。 该 容 器从 XML 文 件 读 取 配 置 元 数 据 并 用 它 去 创 建 一 个 完 全 配 置的 系 统 或 应 用 。

## **7. 解 释 AOP 模 块**

> AOP 模 块 用 于 发 给 我 们 的 Spring 应 用 做 面 向 切 面 的 开发 ， 很 多 支 持 由 AOP 联 盟 提 供 ， 这 样 就 确 保 了 Spring和 其 他 AOP 框 架 的 共 通 性 。 这 个 模 块 将 元 数 据 编 程 引 入Spring。

**8. 解 释 JDBC 抽 象 和 DAO 模 块 。**

通 过 使 用 JDBC 抽 象 和 DAO 模 块 ， 保 证 数 据 库 代 码 的 简

洁 ， 并 能 避 免 数 据 库 资 源 错 误 关 闭 导 致 的 问 题 ， 它 在 各

种 不 同 的 数 据 库 的 错 误 信 息 之 上 ， 提 供 了 一 个 统 一 的 异

常 访 问 层 。 它 还 利 用 Spring 的 AOP 模 块 给 Spring 应

用 中 的 对 象 提 供 事 务 管 理 服 务 。

**9. 解 释 对 象/关 系 映 射 集 成 模 块 。**Spring 通 过 提 供 ORM 模 块 ， 支 持 我 们 在 直 接 JDBC 之

上 使 用 一 个 对 象/关 系 映 射 映 射(ORM)工 具 ，Spring 支

持 集 成 主 流 的 ORM 框 架 ， 如 Hiberate,JDO 和

iBATIS SQL Maps。Spring 的 事 务 管 理 同 样 支 持 以 上

所 有 ORM 框 架 及 JDBC。

**10. 解 释 WEB 模 块 。**

Spring 的 WEB 模 块 是 构 建 在 application context 模

块 基 础 之 上 ， 提 供 一 个 适 合 web 应 用 的 上 下 文 。 这 个 模

块 也 包 括 支 持 多 种 面 向 web 的 任 务 ， 如 透 明 地 处 理 多 个

文 件 上 传 请 求 和 程 序 级 请 求 参 数 的 绑 定 到 你 的 业 务 对

象 。 它 也 有 对 Jakarta Struts 的 支 持 。

**12. Spring 配 置 文 件**

Spring 配 置 文 件 是 个 XML 文 件 ， 这 个 文 件 包 含 了 类 信

息 ， 描 述 了 如 何 配 置 它 们 ， 以 及 如 何 相 互 调 用 。

**13. 什 么 是 Spring IOC 容 器 ？**

Spring IOC 负 责 创 建 对 象 ， 管 理 对 象 （ 通 过 依 赖 注 入

（DI） ， 装 配 对 象 ， 配 置 对 象 ， 并 且 管 理 这 些 对 象 的 整

个 生 命 周 期 。

**14. IOC 的 优 点 是 什 么 ？**

IOC 或 依 赖 注 入 把 应 用 的 代 码 量 降 到 最 低 。 它 使 应 用 容

易 测 试 ， 单 元 测 试 不 再 需 要 单 例 和 JNDI 查 找 机 制 。 最小 的 代 价 和 最 小 的 侵 入 性 使 松 散 耦 合 得 以 实 现 。IOC 容

器 支 持 加 载 服 务 时 的 饿 汉 式 初 始 化 和 懒 加 载 。

**15. ApplicationContext 通 常 的 实 现 是 什 么?** 

 **FileSystemXmlApplicationContext ：**此 容 器 从 一 个

XML 文 件 中 加 载 beans 的 定 义 ，XML Bean 配 置 文 件 的

全 路 径 名 必 须 提 供 给 它 的 构 造 函 数 。

 **ClassPathXmlApplicationContext：**此 容 器 也 从 一 个

XML 文 件 中 加 载 beans 的 定 义 ， 这 里 ， 你 需 要 正 确 设 置

classpath 因 为 这 个 容 器 将 在 classpath 里 找 bean 配

置 。

 **WebXmlApplicationContext：**此 容 器 加 载 一 个 XML

文 件 ， 此 文 件 定 义 了 一 个 WEB 应 用 的 所 有 bean。

**16. Bean 工 厂 和 Application contexts 有 什 么 区**

**别 ？**

Application contexts 提 供 一 种 方 法 处 理 文 本 消 息 ， 一

个 通 常 的 做 法 是 加 载 文 件 资 源 （ 比 如 镜 像 ） ， 它 们 可 以

向 注 册 为 监 听 器 的 bean 发 布 事 件 。 另 外 ， 在 容 器 或 容

器 内 的 对 象 上 执 行 的 那 些 不 得 不 由 bean 工 厂 以 程 序 化

方 式 处 理 的 操 作 ， 可 以 在 Application contexts 中 以 声

明 的 方 式 处 理 。Application contexts 实 现 了

MessageSource 接 口 ， 该 接 口 的 实 现 以 可 插 拔 的 方 式 提

供 获 取 本 地 化 消 息 的 方 法 。**17. 一 个 Spring 的 应 用 看 起 来 象 什 么 ？**

 一 个 定 义 了 一 些 功 能 的 接 口 。

 这 实 现 包 括 属 性 ， 它 的 Setter ， getter 方 法 和 函 数

等 。

 Spring AOP

 Spring 的 XML 配 置 文 件

 使 用 以 上 功 能 的 客 户 端 程 序

**依 赖 注 入**

**18. 什 么 是 Spring 的 依 赖 注 入 ？**

依 赖 注 入 ， 是 IOC 的 一 个 方 面 ， 是 个 通 常 的 概 念 ， 它 有

多 种 解 释 。 这 概 念 是 说 你 不 用 创 建 对 象 ， 而 只 需 要 描 述

它 如 何 被 创 建 。 你 不 在 代 码 里 直 接 组 装 你 的 组 件 和 服

务 ， 但 是 要 在 配 置 文 件 里 描 述 哪 些 组 件 需 要 哪 些 服 务 ，

之 后 一 个 容 器 （IOC 容 器 ） 负 责 把 他 们 组 装 起 来 。

**19. 有 哪 些 不 同 类 型 的 IOC（ 依 赖 注 入 ） 方 式 ？**

 **构 造 器 依 赖 注 入 ：**构 造 器 依 赖 注 入 通 过 容 器 触 发 一 个 类

的 构 造 器 来 实 现 的 ， 该 类 有 一 系 列 参 数 ， 每 个 参 数 代 表

一 个 对 其 他 类 的 依 赖 。

 **Setter 方 法 注 入 ：**Setter 方 法 注 入 是 容 器 通 过 调 用 无 参

构 造 器 或 无 参 static 工 厂 方 法 实 例 化 bean 之 后 ， 调 用

该 bean 的 setter 方 法 ， 即 实 现 了 基 于 setter 的 依 赖 注

入 。**20. 哪 种 依 赖 注 入 方 式 你 建 议 使 用 ， 构 造 器 注 入 ， 还 是**

**Setter 方 法 注 入 ？**

你 两 种 依 赖 方 式 都 可 以 使 用 ， 构 造 器 注 入 和 Setter 方 法

注 入 。 最 好 的 解 决 方 案 是 用 构 造 器 参 数 实 现 强 制 依 赖 ，

setter 方 法 实 现 可 选 依 赖 。

**Spring Beans**

**21.什 么 是 Spring beans?**

Spring beans 是 那 些 形 成 Spring 应 用 的 主 干 的 java 对

象 。 它 们 被 Spring IOC 容 器 初 始 化 ， 装 配 ， 和 管 理 。 这

些 beans 通 过 容 器 中 配 置 的 元 数 据 创 建 。 比 如 ， 以 XML

文 件 中<bean/> 的 形 式 定 义 。

Spring 框 架 定 义 的 beans 都 是 单 件 beans。 在

bean tag 中 有 个 属 性”singleton”， 如 果 它 被 赋 为

TRUE，bean 就 是 单 件 ， 否 则 就 是 一 个

prototype bean。 默 认 是 TRUE， 所 以 所 有 在 Spring

框 架 中 的 beans 缺 省 都 是 单 件 。

**22. 一 个 Spring Bean 定 义 包 含 什 么 ？**

一 个 Spring Bean 的 定 义 包 含 容 器 必 知 的 所 有 配 置 元 数

据 ， 包 括 如 何 创 建 一 个 bean， 它 的 生 命 周 期 详 情 及 它 的

依 赖 。

**23. 如 何 给 Spring 容 器 提 供 配 置 元 数 据?**这 里 有 三 种 重 要 的 方 法 给 Spring 容 器 提 供 配 置 元 数

据 。

XML 配 置 文 件 。

基 于 注 解 的 配 置 。

基 于 java 的 配 置 。

**24. 你 怎 样 定 义 类 的 作 用 域?**

当 定 义 一 个<bean> 在 Spring 里 ， 我 们 还 能 给 这 个

bean 声 明 一 个 作 用 域 。 它 可 以 通 过 bean 定 义 中 的

scope 属 性来 定 义 。 如 ， 当 Spring 要 在 需 要 的 时 候 每 次

生 产 一 个 新 的 bean 实 例 ，bean 的 scope 属 性 被 指 定 为

prototype。 另 一 方 面 ， 一 个 bean 每 次 使 用 的 时 候 必 须

返 回 同 一 个 实 例 ， 这 个 bean 的 scope 属 性 必 须 设 为

singleton。

**25. 解 释 Spring 支 持 的 几 种 bean 的 作 用 域 。**

Spring 框 架 支 持 以 下 五 种 bean 的 作 用 域 ：

 **singleton :** bean 在 每 个 Spring ioc 容 器 中 只 有 一 个 实

例 。

 **prototype**： 一 个 bean 的 定 义 可 以 有 多 个 实 例 。

 **request**： 每 次 http 请 求 都 会 创 建 一 个 bean， 该 作 用

域 仅 在 基 于 web 的 Spring ApplicationContext 情 形 下

有 效 。 **session**： 在 一 个 HTTP Session 中 ， 一 个 bean 定 义 对

应 一 个 实 例 。 该 作 用 域 仅 在 基 于 web 的

Spring ApplicationContext 情 形 下 有 效 。

 **global-session**： 在 一 个 全 局 的 HTTP Session 中 ， 一

个 bean 定 义 对 应 一 个 实 例 。 该 作 用 域 仅 在 基 于 web 的

Spring ApplicationContext 情 形 下 有 效 。

缺 省 的 Spring bean 的 作 用 域 是 Singleton.

**26. Spring 框 架 中 的 单 例 bean 是 线 程 安 全 的 吗?**

不 ，Spring 框 架 中 的 单 例 bean 不 是 线 程 安 全 的 。

**27. 解 释 Spring 框 架 中 bean 的 生 命 周 期 。**

 Spring 容 器 从 XML 文 件 中 读 取 bean 的 定 义 ， 并 实 例

化 bean。 

 Spring 根 据 bean 的 定 义 填 充 所 有 的 属 性 。

 如 果 bean 实 现 了 BeanNameAware 接 口 ，Spring 传 

递 bean 的 ID 到 setBeanName 方 法 。

 如 果 Bean 实 现 了 BeanFactoryAware 接 口 ， Spring

传 递 beanfactory 给 setBeanFactory 方 法 。

 如 果 有 任 何 与 bean 相 关 联 的 BeanPostProcessors，

Spring 会 在 postProcesserBeforeInitialization()方 法

内 调 用 它 们 。 如 果 bean 实 现 IntializingBean 了 ， 调 用 它 的

afterPropertySet 方 法 ， 如 果 bean 声 明 了 初 始 化 方

法 ， 调 用 此 初 始 化 方 法 。

 如 果 有 BeanPostProcessors 和 bean 关 联 ， 这 些 bean

的 postProcessAfterInitialization() 方 法 将 被 调 用 。

 如 果 bean 实 现 了 DisposableBean， 它 将 调 用

destroy()方 法 。

**28. 哪 些 是 重 要 的 bean 生 命 周 期 方 法 ？ 你 能 重 载 它 们**

**吗 ？**

有 两 个 重 要 的 bean 生 命 周 期 方 法 ， 第 一 个 是 setup ，

它 是 在 容 器 加 载 bean 的 时 候 被 调 用 。 第 二 个 方 法 是

teardown 它 是 在 容 器 卸 载 类 的 时 候 被 调 用 。

The bean 标 签 有 两 个 重 要 的 属 性 （init-method 和

destroy-method） 。 用 它 们 你 可 以 自 己 定 制 初 始 化 和 注

销 方 法 。 它 们 也 有 相 应 的 注 解 （@PostConstruct 和

@PreDestroy） 。

**29. 什 么 是 Spring 的 内 部 bean？**

当 一 个 bean 仅 被 用 作 另 一 个 bean 的 属 性 时 ， 它 能 被 声

明 为 一 个 内 部 bean， 为 了 定 义 inner bean， 在 Spring

的 基 于 XML 的 配 置 元 数 据 中 ， 可 以 在 <property/>

或 <constructor-arg/> 元 素 内 使 用<bean/> 元 素 ， 内部 bean 通 常 是 匿 名 的 ， 它 们 的 Scope 一 般 是

prototype。

**30. 在 Spring 中 如 何 注 入 一 个 java 集 合 ？**

Spring 提 供 以 下 几 种 集 合 的 配 置 元 素 ：

 <list>类 型 用 于 注 入 一 列 值 ， 允 许 有 相 同 的 值 。

 <set> 类 型 用 于 注 入 一 组 值 ， 不 允 许 有 相 同 的 值 。

 <map> 类 型 用 于 注 入 一 组 键 值 对 ， 键 和 值 都 可 以 为 任

意 类 型 。

 <props>类 型 用 于 注 入 一 组 键 值 对 ， 键 和 值 都 只 能 为

String 类 型 。

**31. 什 么 是 bean 装 配?**

装 配 ， 或 bean 装 配 是 指 在 Spring 容 器 中 把 bean 组 装

到 一 起 ， 前 提 是 容 器 需 要 知 道 bean 的 依 赖 关 系 ， 如 何

通 过 依 赖 注 入 来 把 它 们 装 配 到 一 起 。

**32. 什 么 是 bean 的 自 动 装 配 ？**

Spring 容 器 能 够 自 动 装 配 相 互 合 作 的 bean， 这 意 味 着

容 器 不 需 要<constructor-arg>和<property>配 置 ， 能

通 过 Bean 工 厂 自 动 处 理 bean 之 间 的 协 作 。

**33. 解 释 不 同 方 式 的 自 动 装 配 。**

有 五 种 自 动 装 配 的 方 式 ， 可 以 用 来 指 导 Spring 容 器 用 自

动 装 配 方 式 来 进 行 依 赖 注 入 。 **no**： 默 认 的 方 式 是 不 进 行 自 动 装 配 ， 通 过 显 式 设 置 ref

属 性 来 进 行 装 配 。

 **byName：**通 过 参 数 名 自 动 装 配 ，Spring 容 器 在 配 置

文 件 中 发 现 bean 的 autowire 属 性 被 设 置 成 byname，

之 后 容 器 试 图 匹 配 、 装 配 和 该 bean 的 属 性 具 有 相 同 名

字 的 bean。 

 **byType:：**通 过 参 数 类 型 自 动 装 配 ，Spring 容 器 在 配 置

文 件 中 发 现 bean 的 autowire 属 性 被 设 置 成 byType，

之 后 容 器 试 图 匹 配 、 装 配 和 该 bean 的 属 性 具 有 相 同 类

型 的 bean。 如 果 有 多 个 bean 符 合 条 件 ， 则 抛 出 错 误 。

 **constructor： 这 个 方 式 类 似 于** byType， 但 是 要 提 供

给 构 造 器 参 数 ， 如 果 没 有 确 定 的 带 参 数 的 构 造 器 参 数 类

型 ， 将 会 抛 出 异 常 。

 **autodetect：**首 先 尝 试 使 用 constructor 来 自 动 装 配 ，

如 果 无 法 工 作 ， 则 使 用 byType 方 式 。

**34.自 动 装 配 有 哪 些 局 限 性 ?**

自 动 装 配 的 局 限 性 是 ：

 **重 写**： 

你 仍 需 用 <constructor-arg>和 <property>

配 置 来 定 义 依 赖 ， 意 味 着 总 要 重 写 自 动 装 配 。

 **基 本 数 据 类 型**： 你 不 能 自 动 装 配 简 单 的 属 性 ， 如 基 本 数

据 类 型 ，String 字 符 串 ， 和 类 。 **模 糊 特 性 ：**自 动 装 配 不 如 显 式 装 配 精 确 ， 如 果 有 可 能 ，

建 议 使 用 显 式 装 配 。

**35. 你 可 以 在 Spring 中 注 入 一 个 null 和 一 个 空 字 符 串**

**吗 ？**

**可 以 。**

**Spring 注 解**

**36. 什 么 是 基 于 Java 的 Spring 注 解 配 置? 给 一 些 注 解**

**的 例 子.**

基 于 Java 的 配 置 ， 允 许 你 在 少 量 的 Java 注 解 的 帮 助

下 ， 进 行 你 的 大 部 分 Spring 配 置 而 非 通 过 XML 文 件 。

以@Configuration 注 解 为 例 ， 它 用 来 标 记 类 可 以 当 做

一 个 bean 的 定 义 ， 被 Spring IOC 容 器 使 用 。 另 一 个 例

子 是@Bean 注 解 ， 它 表 示 此 方 法 将 要 返 回 一 个 对 象 ， 作

为 一 个 bean 注 册 进 Spring 应 用 上 下 文 。

**37. 什 么 是 基 于 注 解 的 容 器 配 置?**

相 对 于 XML 文 件 ， 注 解 型 的 配 置 依 赖 于 通 过 字 节 码 元 数

据 装 配 组 件 ， 而 非 尖 括 号 的 声 明 。

开 发 者 通 过 在 相 应 的 类 ， 方 法 或 属 性 上 使 用 注 解 的 方

式 ， 直 接 组 件 类 中 进 行 配 置 ， 而 不 是 使 用 xml 表 述

bean 的 装 配 关 系 。

**38. 怎 样 开 启 注 解 装 配 ？**注 解 装 配 在 默 认 情 况 下 是 不 开 启 的 ， 为 了 使 用 注 解 装

配 ， 我 们 必 须 在 Spring 配 置 文 件 中 配 置

<context:annotation-config/>元 素 。

**39. @Required 注 解**

这 个 注 解 表 明 bean 的 属 性 必 须 在 配 置 的 时 候 设 置 ， 通

过 一 个 bean 定 义 的 显 式 的 属 性 值 或 通 过 自 动 装 配 ， 若

@Required 注 解 的 bean 属 性 未 被 设 置 ， 容 器 将 抛 出

BeanInitializationException。

**40. @Autowired 注 解**

@Autowired 注 解 提 供 了 更 细 粒 度 的 控 制 ， 包 括 在 何 处

以 及 如 何 完 成 自 动 装 配 。 它 的 用 法 和@Required 一 样 ，

修饰 setter 方 法 、 构 造 器 、 属 性 或 者 具 有 任 意 名 称 和/或

多 个 参 数 的 PN 方 法 。

**41. @Qualifier 注 解**

当 有 多 个 相 同 类 型 的 bean 却 只 有 一 个 需 要 自 动 装 配

时 ， 将@Qualifier 注 解 和@Autowire 注 解 结 合 使 用 以

消 除 这 种 混 淆 ， 指 定 需 要 装 配 的 确 切 的 bean。

**Spring 数 据 访 问**

**42.在 Spring 框 架 中 如 何 更 有 效 地 使 用 JDBC?**

使 用 SpringJDBC 框 架 ， 资 源 管 理 和 错 误 处 理 的 代 价 都

会 被 减 轻 。 所 以 开 发 者 只 需 写 statements 和 queries

从 数 据 存 取 数 据 ，JDBC 也 可 以 在 Spring 框 架 提 供 的 模板 类 的 帮 助 下 更 有 效 地 被 使 用 ， 这 个 模 板 叫

JdbcTemplate （ 例 子 见 这 里 here）

**43. JdbcTemplate**

JdbcTemplate 类 提 供 了 很 多 便 利 的 方 法 解 决 诸 如 把 数

据 库 数 据 转 变 成 基 本 数 据 类 型 或 对 象 ， 执 行 写 好 的 或 可

调 用 的 数 据 库 操 作 语 句 ， 提 供 自 定 义 的 数 据 错 误 处 理 。

**44. Spring 对 DAO 的 支 持**

Spring 对 数 据 访 问 对 象 （DAO） 的 支 持 旨 在 简 化 它 和 数

据 访 问 技 术 如 JDBC，Hibernate or JDO 结 合 使 用 。 这

使 我 们 可 以 方 便 切 换 持 久 层 。 编 码 时 也 不 用 担 心 会 捕 获

每 种 技 术 特 有 的 异 常 。

**45. 使 用 Spring 通 过 什 么 方 式 访 问 Hibernate?**

在 Spring 中 有 两 种 方 式 访 问 Hibernate： 

 控 制 反 转 Hibernate Template 和 Callback。 

 继 承 HibernateDAOSupport 提 供 一 个 AOP 拦 截 器 。

**46. Spring 支 持 的 ORM**

Spring 支 持 以 下 ORM： 

 Hibernate

 iBatis

 JPA (Java Persistence API)

 TopLink

 JDO (Java Data Objects) OJB

**47.如 何 通 过 HibernateDaoSupport 将 Spring 和**

**Hibernate 结 合 起 来 ？**

用 Spring 的 SessionFactory 调 用

LocalSessionFactory。 集 成 过 程 分 三 步 ：

 配 置 the Hibernate SessionFactory。 

 继 承 HibernateDaoSupport 实 现 一 个 DAO。 

 在 AOP 支 持 的 事 务 中 装 配 。

**48. Spring 支 持 的 事 务 管 理 类 型**

Spring 支 持 两 种 类 型 的 事 务 管 理 ：

 **编 程 式 事 务 管 理**： 这 意 味 你 通 过 编 程 的 方 式 管 理 事 务 ，

给 你 带 来 极 大 的 灵 活 性 ， 但 是 难 维 护 。

 **声 明 式 事 务 管 理 ：**这 意 味 着 你 可 以 将 业 务 代 码 和 事 务 管

理 分 离 ， 你 只 需 用 注 解 和 XML 配 置 来 管 理 事 务 。

**49. Spring 框 架 的 事 务 管 理 有 哪 些 优 点 ？**

 它 为 不 同 的 事 务 API 如 JTA，JDBC，Hibernate，JPA

和 JDO， 提 供 一 个 不 变 的 编 程 模 式 。

 它 为 编 程 式 事 务 管 理 提 供 了 一 套 简 单 的 API 而 不 是 一 些

复 杂 的 事 务 API 如 

 它 支 持 声 明 式 事 务 管 理 。

 它 和 Spring 各 种 数 据 访 问 抽 象 层 很 好 得 集 成 。

**50. 你 更 倾 向 用 那 种 事 务 管 理 类 型 ？**大 多 数 Spring 框 架 的 用 户 选 择 声 明 式 事 务 管 理 ， 因 为 它

对 应 用 代 码 的 影 响 最 小 ， 因 此 更 符 合 一 个 无 侵 入 的 轻 量

级 容 器 的 思 想 。 声 明 式 事 务 管 理 要 优 于 编 程 式 事 务 管

理 ， 虽 然 比 编 程 式 事 务 管 理 （ 这 种 方 式 允 许 你 通 过 代 码

控 制 事 务 ） 少 了 一 点 灵 活 性 。

**Spring 面 向 切 面 编 程 （AOP）**

**51. 解 释 AOP**

面 向 切 面 的 编 程 ， 或 AOP， 是 一 种 编 程 技 术 ， 允 许 程 序

模 块 化 横 向 切 割 关 注 点 ， 或 横 切 典 型 的 责 任 划 分 ， 如 日

志 和 事 务 管 理 。

**52. Aspect 切 面**

AOP 核 心 就 是 切 面 ， 它 将 多 个 类 的 通 用 行 为 封 装 成 可 重

用 的 模 块 ， 该 模 块 含 有 一 组 API 提 供 横 切 功 能 。 比 如 ，

一 个 日 志 模 块 可 以 被 称 作 日 志 的 AOP 切 面 。 根 据 需 求 的

不 同 ， 一 个 应 用 程 序 可 以 有 若 干 切 面 。 在 Spring AOP

中 ， 切 面 通 过 带 有@Aspect 注 解 的 类 实 现 。

**52. 在 Spring AOP 中 ， 关 注 点 和 横 切 关 注 的 区 别 是 什**

**么 ？**

关 注 点 是 应 用 中 一 个 模 块 的 行 为 ， 一 个 关 注 点 可 能 会 被

定 义 成 一 个 我 们 想 实 现 的 一 个 功 能 。

横 切 关 注 点 是 一 个 关 注 点 ， 此 关 注 点 是 整 个 应 用 都 会 使

用 的 功 能 ， 并 影 响 整 个 应 用 ， 比 如 日 志 ， 安 全 和 数 据 传输 ， 几 乎 应 用 的 每 个 模 块 都 需 要 的 功 能 。 因 此 这 些 都 属

于 横 切 关 注 点 。

**54. 连 接 点**

连 接 点 代 表 一 个 应 用 程 序 的 某 个 位 置 ， 在 这 个 位 置 我 们

可 以 插 入 一 个 AOP 切 面 ， 它 实 际 上 是 个 应 用 程 序 执 行

Spring AOP 的 位 置 。

**55. 通 知**

通 知 是 个 在 方 法 执 行 前 或 执 行 后 要 做 的 动 作 ， 实 际 上 是

程 序 执 行 时 要 通 过 SpringAOP 框 架 触 发 的 代 码 段 。

Spring 切 面 可 以 应 用 五 种 类 型 的 通 知 ：

 **before**： 前 置 通 知 ， 在 一 个 方 法 执 行 前 被 调 用 。

 **after:** 在 方 法 执 行 之 后 调 用 的 通 知 ， 无 论 方 法 执 行 是 否

成 功 。

 **after-returning:** 仅 当 方 法 成 功 完 成 后 执 行 的 通 知 。

 **after-throwing:** 在 方 法 抛 出 异 常 退 出 时 执 行 的 通 知 。

 **around:** 在 方 法 执 行 之 前 和 之 后 调 用 的 通 知 。

**56. 切 点**

切 入 点 是 一 个 或 一 组 连 接 点 ， 通 知 将 在 这 些 位 置 执 行 。

可 以 通 过 表 达 式 或 匹 配 的 方 式 指 明 切 入 点 。

**57. 什 么 是 引 入?**

引 入 允 许 我 们 在 已 存 在 的 类 中 增 加 新 的 方 法 和 属 性 。

**58. 什 么 是 目 标 对 象?**被 一 个 或 者 多 个 切 面 所 通 知 的 对 象 。 它 通 常 是 一 个 代 理

对 象 。 也 指 被 通 知 （advised） 对 象 。

**59. 什 么 是 代 理?**

代 理 是 通 知 目 标 对 象 后 创 建 的 对 象 。 从 客 户 端 的 角 度

看 ， 代 理 对 象 和 目 标 对 象 是 一 样 的 。

**60. 有 几 种 不 同 类 型 的 自 动 代 理 ？**

BeanNameAutoProxyCreator

DefaultAdvisorAutoProxyCreator

Metadata autoproxying

**61. 什 么 是 织 入 。 什 么 是 织 入 应 用 的 不 同 点 ？**

织 入 是 将 切 面 和 到 其 他 应 用 类 型 或 对 象 连 接 或 创 建 一 个

被 通 知 对 象 的 过 程 。

织 入 可 以 在 编 译 时 ， 加 载 时 ， 或 运 行 时 完 成 。

**62. 解 释 基 于 XML Schema 方 式 的 切 面 实 现 。**

在 这 种 情 况 下 ， 切 面 由 常 规 类 以 及 基 于 XML 的 配 置 实

现 。

**63. 解 释 基 于 注 解 的 切 面 实 现**

在 这 种 情 况 下(基 于@AspectJ 的 实 现)， 涉 及 到 的 切 面 声

明 的 风 格 与 带 有 java5 标 注 的 普 通 java 类 一 致 。

**Spring 的 MVC**

**64. 什 么 是 Spring 的 MVC 框 架 ？**Spring 配 备 构 建 Web 应 用 的 全 功 能 MVC 框 架 。

Spring 可 以 很 便 捷 地 和 其 他 MVC 框 架 集 成 ， 如

Struts，Spring 的 MVC 框 架 用 控 制 反 转 把 业 务 对 象 和

控 制 逻 辑 清 晰 地 隔 离 。 它 也 允 许 以 声 明 的 方 式 把 请 求 参

数 和 业 务 对 象 绑 定 。

**65. DispatcherServlet**

Spring 的 MVC 框 架 是 围 绕 DispatcherServlet 来 设 计

的 ， 它 用 来 处 理 所 有 的 HTTP 请 求 和 响 应 。

**66. WebApplicationContext**

WebApplicationContext 继 承 了 ApplicationContext

并 增 加 了 一 些 WEB 应 用 必 备 的 特有 功 能 ， 它 不 同 于 一

般 的 ApplicationContext ， 因 为 它 能 处 理 主 题 ， 并 找

到 被 关 联 的 servlet。

**67. 什 么 是 Spring MVC 框 架 的 控 制 器 ？**

控 制 器 提 供 一 个 访 问 应 用 程 序 的 行 为 ， 此 行 为 通 常 通 过

服 务 接 口 实 现 。 控 制 器 解 析 用 户 输 入 并 将 其 转 换 为 一 个

由 视 图 呈 现 给 用 户 的 模 型 。Spring 用 一 个 非 常 抽 象 的 方

式 实 现 了 一 个 控 制 层 ， 允 许 用 户 创 建 多 种 用 途 的 控 制

器 。

**68. @Controller 注 解**

该 注 解 表 明 该 类 扮 演 控 制 器 的 角 色 ，Spring 不 需 要 你 继

承 任 何 其 他 控 制 器 基 类 或 引 用 Servlet API。**69. @RequestMapping 注 解**

该 注 解 是 用 来 映 射 一 个 URL 到 一 个 类 或 一 个 特 定 的 方 处

理 法 上 。



------------------------------------------------------

1、什么是 Spring 框架？Spring 框架有哪些主要模块？

Spring 框架是一个为 Java 应用程序的开发提供了综合、广泛

的基础性支持的 Java 平台。Spring 帮助开发者解决了开发中

基础性的问题，使得开发人员可以专注于应用程序的开发。

Spring 框架本身亦是按照设计模式精心打造，这使得我们可

以在开发环境中安心的集成 Spring 框架，不必担心 Spring 是

如何在后台进行工作的。

Spring 框架至今已集成了 20 多个模块。这些模块主要被分如

下图所示的核心容器、数据访问/集成,、Web、AOP（面向切

面编程）、工具、消息和测试模块。

2、使用 Spring 框架能带来哪些好处？

下面列举了一些使用 Spring 框架带来的主要好处：

 Dependency Injection(DI) 

方法使得构造器和 JavaBean

properties 文件中的依赖关系一目了然。

 与 EJB 容器相比较，IoC 容器更加趋向于轻量级。这样一来

IoC 容器在有限的内存和 CPU 资源的情况下进行应用程序的

开发和发布就变得十分有利。 Spring 并没有闭门造车，Spring 利用了已有的技术比如

ORM 框架、logging 框架、J2EE、Quartz 和 JDK Timer，以

及其他视图技术。

 Spring 框架是按照模块的形式来组织的。由包和类的编号就

可以看出其所属的模块，开发者仅仅需要选用他们需要的模块

即可。

 要测试一项用 Spring 开发的应用程序十分简单，因为测试相

关的环境代码都已经囊括在框架中了。更加简单的是，利用

JavaBean 形式的 POJO 类，可以很方便的利用依赖注入来写

入测试数据。

 Spring 的 Web 框架亦是一个精心设计的 Web MVC 框架，为

开发者们在 web 框架的选择上提供了一个除了主流框架比如

Struts、过度设计的、不流行 web 框架的以外的有力选项。

 Spring 提供了一个便捷的事务管理接口，适用于小型的本地

事物处理（比如在单 DB 的环境下）和复杂的共同事物处理

（比如利用 JTA 的复杂 DB 环境）。

3、什么是控制反转(IOC)？什么是依赖注入？

 控制反转是应用于软件工程领域中的，在运行时被装配器对象

来绑定耦合对象的一种编程技巧，对象之间耦合关系在编译时

通常是未知的。在传统的编程方式中，业务逻辑的流程是由应

用程序中的早已被设定好关联关系的对象来决定的。在使用控制反转的情况下，业务逻辑的流程是由对象关系图来决定的，

该对象关系图由装配器负责实例化，这种实现方式还可以将对

象之间的关联关系的定义抽象化。而绑定的过程是通过“依赖

注入”实现的。

 控制反转是一种以给予应用程序中目标组件更多控制为目的设

计范式，并在我们的实际工作中起到了有效的作用。

 依赖注入是在编译阶段尚未知所需的功能是来自哪个的类的情

况下，将其他对象所依赖的功能对象实例化的模式。这就需要

一种机制用来激活相应的组件以提供特定的功能，所以依赖注

入是控制反转的基础。否则如果在组件不受框架控制的情况

下，框架又怎么知道要创建哪个组件？

在 Java 中依然注入有以下三种实现方式：

\1. 构造器注入

\2. Setter 方法注入

\3. 接口注入

4、请解释下 Spring 框架中的 IoC？ 

 Spring 中的 

org.springframework.beans 

包和

org.springframework.context 包构成了 Spring 框架 IoC 容

器的基础。 BeanFactory 

接口提供了一个先进的配置机制，使得任何类

型的对象的配置成为可能。ApplicationContex 接口对

BeanFactory（是一个子接口）进行了扩展，在 BeanFactory

的基础上添加了其他功能，比如与 Spring 的 AOP 更容易集

成，也提供了处理 message 

resource 的机制（用于国际

化）、事件传播以及应用层的特别配置，比如针对 Web 应用

的 WebApplicationContext。 

 org.springframework.beans.factory.BeanFactory 

是

Spring IoC 容器的具体实现，用来包装和管理前面提到的各种

bean。BeanFactory 接口是 Spring IoC 容器的核心接口。

5、BeanFactory 和 ApplicationContext 有什么区别？



BeanFactory 

可以理解为含有 bean 集合的工厂类。

BeanFactory 包含了种 bean 的定义，以便在接收到客户端请

求时将对应的 bean 实例化。



BeanFactory 还能在实例化对象的时生成协作类之间的关系。

此举将 bean 自身与 bean 客户端的配置中解放出来。

BeanFactory 还包含了 bean 生命周期的控制，调用客户端的初始化方法（initialization 

methods）和销毁方法

（destruction methods）。



从表面上看，application context 如同 bean factory 一样具

有 bean 定义、bean 关联关系的设置，根据请求分发 bean 的

功能。但 application context 在此基础上还提供了其他的功

能。

\1. 提供了支持国际化的文本消息

\2. 统一的资源文件读取方式

\3. 已在监听器中注册的 bean 的事件 

以下是三种较常见的

ApplicationContext 实现方式：

1、ClassPathXmlApplicationContext：从 classpath 的

XML 配置文件中读取上下文，并生成上下文定义。应用程序

上下文从程序环境变量中取得。

\1. ApplicationContext context = new

ClassPathXmlApplicationContext(“bean.xml”);2、FileSystemXmlApplicationContext ：由文件系统中的

XML 配置文件读取上下文。

\1. ApplicationContext context = new

FileSystemXmlApplicationContext(“bean.xml”);

3、XmlWebApplicationContext：由 Web 应用的 XML 文件

读取上下文。

6、Spring 有几种配置方式？

将 Spring 配置到应用开发中有以下三种方式：

\1. 基于 XML 的配置

\2. 基于注解的配置

\3. 基于 Java 的配置

7、如何用基于 XML 配置的方式配置 Spring？ 

 在 Spring 框架中，依赖和服务需要在专门的配置文件来实

现，我常用的 XML 格式的配置文件。这些配置文件的格式通

常用开头，然后一系列的 bean 定义和专门的应用配置选项组

成。

 SpringXML 配置的主要目的时候是使所有的 Spring 组件都可

以用 xml 文件的形式来进行配置。这意味着不会出现其他的Spring 配置类型（比如声明的方式或基于 Java Class 的配置

方式）

 Spring 的 XML 配置方式是使用被 Spring 命名空间的所支持

的一系列的 XML 标签来实现的。Spring 有以下主要的命名空

间：context、beans、jdbc、tx、aop、mvc 和 aso。 

\1. <beans>

2.

\3. <!-- JSON Support -->

\4. <bean name="viewResolver"

class="org.springframework.web.servlet.view.BeanNameVi

ewResolver"/>

\5. <bean name="jsonTemplate"

class="org.springframework.web.servlet.view.json.Mappi

ngJackson2JsonView"/>

6.

\7. <bean id="restTemplate"

class="org.springframework.web.client.RestTemplate"/>

8.

\9. </beans>

下面这个 web.xml 仅仅配置了 DispatcherServlet，这件最简

单的配置便能满足应用程序配置运行时组件的需求。1. <web-app>

\2. <display-name>Archetype Created Web

Application</display-name>

3.

\4. <servlet>

\5. <servlet-name>spring</servlet-name>

\6. <servlet-class>

\7. 

org.springframework.web.servlet.DispatcherServlet

\8. </servlet-class>

\9. <load-on-startup>1</load-on-startup>

10.

 </servlet>

11.

12.

 <servlet-mapping>

13.

 <servlet-name>spring</servlet-name>

14.

 <url-pattern>/</url-pattern>

15.

 </servlet-mapping>

16.

\17. 

</web-app>

8、如何用基于 Java 配置的方式配置 Spring？Spring 对 Java 配置的支持是由@Configuration 注解和

@Bean 注解来实现的。由@Bean 注解的方法将会实例化、配

置和初始化一个新对象，这个对象将由 Spring 的 IoC 容器来

管理。@Bean 声明所起到的作用与元素类似。被

@Configuration 所注解的类则表示这个类的主要目的是作为

bean 定义的资源。被@Configuration 声明的类可以通过在

同一个类的内部调用@bean 方法来设置嵌入 bean 的依赖关

系。

最简单的@Configuration 声明类请参考下面的代码：

\1. @Configuration

\2. public class AppConfig

\3. { 

\4. @Bean

\5. public MyService myService() { 

\6. return new MyServiceImpl();

\7. } 

\8. }

对于上面的@Beans 配置文件相同的 XML 配置文件如下：

\1. <beans>2. <bean id="myService"

class="com.howtodoinjava.services.MyServiceImpl"/>

\3. </beans>

上述配置方式的实例化方式如下：利用

AnnotationConfigApplicationContext 类进行实例化

\1. public static void main(String[] args) { 

\2. ApplicationContext ctx = new

AnnotationConfigApplicationContext(AppConfig.class);

\3. MyService myService = ctx.getBean(MyService.class);

\4. myService.doStuff();

\5. }

要使用组件组建扫描，仅需用@Configuration 进行注解即

可：

\1. @Configuration

\2. @ComponentScan(basePackages = "com.howtodoinjava") 

\3. public class AppConfig { 

\4. ...

\5. }在上面的例子中，com.acme 包首先会被扫到，然后再容器内

查找被@Component 声明的类，找到后将这些类按照 Sring

bean 定义进行注册。

如果你要在你的 web 应用开发中选用上述的配置的方式的

话，需要用 AnnotationConfigWebApplicationContext 类

来读取配置文件，可以用来配置 Spring 的 Servlet 监听器

ContrextLoaderListener 或者 Spring MVC 的

DispatcherServlet。 

\1. <web-app>

\2. <!-- Configure ContextLoaderListener to use

AnnotationConfigWebApplicationContext

\3. instead of the default XmlWebApplicationContext

-->

\4. <context-param>

\5. <param-name>contextClass</param-name>

\6. <param-value>

\7. 

org.springframework.web.context.support.AnnotationConf

igWebApplicationContext

\8. </param-value>

\9. </context-param>10.

11.

 <!-- Configuration locations must consist of

one or more comma- or space-delimited

12.

 fully-qualified @Configuration classes.

Fully-qualified packages may also be

13.

 specified for component-scanning -->

14.

 <context-param>

15.

 <param

name>contextConfigLocation</param-name>

16.

 <param

value>com.howtodoinjava.AppConfig</param-value>

17.

 </context-param>

18.

19.

 <!-- Bootstrap the root application context as

usual using ContextLoaderListener -->

20.

 <listener>

21.

 <listener

class>org.springframework.web.context.ContextLoaderLis

tener</listener-class>

22.

 </listener>

23.24.

 <!-- Declare a Spring MVC DispatcherServlet as

usual -->

25.

 <servlet>

26.

 <servlet-name>dispatcher</servlet-name>

27.

 <servlet

class>org.springframework.web.servlet.DispatcherServle

t</servlet-class>

28.

 <!-- Configure DispatcherServlet to use

AnnotationConfigWebApplicationContext

29.

 instead of the default

XmlWebApplicationContext -->

30.

 <init-param>

31.

 <param-name>contextClass</param

name>

32.

 <param-value>

33.

 

org.springframework.web.context.support.AnnotationConf

igWebApplicationContext

34.

 </param-value>

35.

 </init-param>

36.

 <!-- Again, config locations must consist

of one or more comma- or space-delimited37.

 and fully-qualified @Configuration

classes -->

38.

 <init-param>

39.

 <param

name>contextConfigLocation</param-name>

40.

 <param

value>com.howtodoinjava.web.MvcConfig</param-value>

41.

 </init-param>

42.

 </servlet>

43.

44.

 <!-- map all requests for /app/* to the

dispatcher servlet -->

45.

 <servlet-mapping>

46.

 <servlet-name>dispatcher</servlet-name>

47.

 <url-pattern>/app/*</url-pattern>

48.

 </servlet-mapping>

\49. 

</web-app>

9、怎样用注解的方式配置 Spring？

Spring 在 2.5 版本以后开始支持用注解的方式来配置依赖注

入。可以用注解的方式来替代 XML 方式的 bean 描述，可以

将 bean 描述转移到组件类的内部，只需要在相关类上、方法上或者字段声明上使用注解即可。注解注入将会被容器在

XML 注入之前被处理，所以后者会覆盖掉前者对于同一个属

性的处理结果。

注解装配在 Spring 中是默认关闭的。所以需要在 Spring 文件

中配置一下才能使用基于注解的装配模式。如果你想要在你的

应用程序中使用关于注解的方法的话，请参考如下的配置。

\1. <beans>

2.

\3. <context:annotation-config/>

\4. <!-- bean definitions go here -->

5.

\6. </beans>

在标签配置完成以后，就可以用注解的方式在 Spring 中向属

性、方法和构造方法中自动装配变量。

下面是几种比较重要的注解类型：

\1. @Required：该注解应用于设值方法。

\2. @Autowired：该注解应用于有值设值方法、非设值方法、构

造方法和变量。3. @Qualifier：该注解和@Autowired 注解搭配使用，用于消除

特定 bean 自动装配的歧义。

\4. JSR-250 Annotations：Spring 支持基于 JSR-250 注解的以

下注解，@Resource、@PostConstruct 

和

@PreDestroy。

10、请解释 Spring Bean 的生命周期？

Spring Bean 的生命周期简单易懂。在一个 bean 实例被初始

化时，需要执行一系列的初始化操作以达到可用的状态。同样

的，当一个 bean 不在被调用时需要进行相关的析构操作，并

从 bean 容器中移除。

Spring bean factory 负责管理在 spring 容器中被创建的

bean 的生命周期。Bean 的生命周期由两组回调（call

back）方法组成。

\1. 初始化之后调用的回调方法。

\2. 销毁之前调用的回调方法。

Spring 框架提供了以下四种方式来管理 bean 的生命周期事

件：

 InitializingBean 和 DisposableBean 回调接口

 针对特殊行为的其他 Aware 接口 Bean 配置文件中的 Custom init()方法和 destroy()方法

 @PostConstruct 和@PreDestroy 注解方式

 使用 customInit()和

customDestroy()方法管理 bean 生命周期的代码样例如下：

\1. <beans>

\2. <bean id="demoBean"

class="com.howtodoinjava.task.DemoBean"

\3. init-method="customInit" destroy

method="customDestroy"></bean>

\4. </beans>

更多内容请参考：Spring 生命周期 Spring Bean Life Cycle。 

\1. https://howtodoinjava.com/spring-core/spring-bean

life-cycle/

11、Spring Bean 的作用域之间有什么区别？

Spring 容器中的 bean 可以分为 5 个范围。所有范围的名称都

是自说明的，但是为了避免混淆，还是让我们来解释一下：1. singleton：这种 bean 范围是默认的，这种范围确保不管接受

到多少个请求，每个容器中只有一个 bean 的实例，单例的模

式由 bean factory 自身来维护。

\2. prototype：原形范围与单例范围相反，为每一个 bean 请求

提供一个实例。

\3. request：在请求 bean 范围内会每一个来自客户端的网络请

求创建一个实例，在请求完成以后，bean 会失效并被垃圾回

收器回收。

\4. Session：与请求范围类似，确保每个 session 中有一个 bean

的实例，在 session 过期后，bean 会随之失效。

\5. global-session：global-session 和 Portlet 应用相关。当你

的应用部署在 Portlet 容器中工作时，它包含很多 portlet。如

果你想要声明让所有的 portlet 共用全局的存储变量的话，那

么这全局变量需要存储在 global-session 中。

全局作用域与 Servlet 中的 session 作用域效果相同。

更多内容请参考 : Spring Bean Scopes。 

\1. https://howtodoinjava.com/spring-core/spring-bean

scopes/

12、什么是 Spring inner beans？在 Spring 框架中，无论何时 bean 被使用时，当仅被调用了

一个属性。一个明智的做法是将这个 bean 声明为内部

bean。内部 bean 可以用 setter 注入“属性”和构造方法注

入“构造参数”的方式来实现。

比如，在我们的应用程序中，一个 Customer 类引用了一个

Person 类，我们的要做的是创建一个 Person 的实例，然后在

Customer 内部使用。

\1. public class Customer

\2. { 

\3. private Person person;

4.

\5. //Setters and Getters

\6. } 

\1. public class Person

\2. { 

\3. private String name;

\4. private String address;

\5. private int age;

6.

\7. //Setters and Getters

\8. }内部 bean 的声明方式如下：

\1. <bean id="CustomerBean"

class="com.howtodoinjava.common.Customer"> 

\2. <property name="person"> 

\3. <!-- This is inner bean -->

\4. <bean class="com.howtodoinjava.common.Person"> 

\5. <property name="name" value="lokesh" />

\6. <property name="address" value="India" />

\7. <property name="age" value="34" />

\8. </bean>

\9. </property>

\10. 

</bean>

13、Spring 框架中的单例 Beans 是线程安全的么？

 Spring 框架并没有对单例 bean 进行任何多线程的封装处理。

关于单例 bean 的线程安全和并发问题需要开发者自行去搞

定。但实际上，大部分的 Spring bean 并没有可变的状态(比 

如 Serview 类和 DAO 类)，所以在某种程度上说 Spring 的单

例 bean 是线程安全的。如果你的 bean 有多种状态的话（比

如 View Model 对象），就需要自行保证线程安全。

 最浅显的解决办法就是将多态 bean 的作用域由“singleton”

变更为“prototype”。14、请举例说明如何在 Spring 中注入一个 Java Collection？

Spring 提供了以下四种集合类的配置元素：

 : 该标签用来装配可重复的 list 值。

 : 该标签用来装配没有重复的 set 值。

 

\- : 该标签支持注入键和值都是字符串类型的键值对。

下面看一下具体的例子：

\1. <beans>

2.

\3. <!-- Definition for javaCollection -->

\4. <bean id="javaCollection"

class="com.howtodoinjava.JavaCollection"> 

5.

\6. <!-- java.util.List -->

\7. <property name="customList"> 

\8. <list>

\9. <value>INDIA</value>

10.

 <value>Pakistan</value>

11.

 <value>USA</value>12.

 <value>UK</value>

13.

 </list>

14.

 </property>

15.

16.

 <!-- java.util.Set -->

17.

 <property name="customSet">

18.

 <set>

19.

 <value>INDIA</value>

20.

 <value>Pakistan</value>

21.

 <value>USA</value>

22.

 <value>UK</value>

23.

 </set>

24.

 </property>

25.

26.

 <!-- java.util.Map -->

27.

 <property name="customMap">

28.

 <map>

29.

 <entry key="1" value="INDIA"/>

30.

 <entry key="2" value="Pakistan"/>

31.

 <entry key="3" value="USA"/>

32.

 <entry key="4" value="UK"/>

33.

 </map>34.

 </property>

35.

36.

 <!-- java.util.Properties -->

37.

 <property name="customProperies">

38.

 <props>

39.

 <prop

key="admin">admin@nospam.com</prop>

40.

 <prop

key="support">support@nospam.com</prop>

41.

 </props>

42.

 </property>

43.

44.

 </bean>

45.

\46. 

</beans>

15、如何向 Spring Bean 中注入一个 Java.util.Properties？

第一种方法是使用如下面代码所示的标签：

\1. <bean id="adminUser"

class="com.howtodoinjava.common.Customer"> 

2.

\3. <!-- java.util.Properties -->4. <property name="emails"> 

\5. <props>

\6. <prop key="admin">admin@nospam.com</prop>

\7. <prop

key="support">support@nospam.com</prop>

\8. </props>

\9. </property>

10.

\11. 

</bean>

也可用”util:”命名空间来从 properties 文件中创建出一个

propertiesbean，然后利用 setter 方法注入 bean 的引用。

16、请解释 Spring Bean 的自动装配？

在 Spring 框架中，在配置文件中设定 bean 的依赖关系是一

个很好的机制，Spring 容器还可以自动装配合作关系 bean 之

间的关联关系。这意味着 Spring 可以通过向 Bean Factory 中

注入的方式自动搞定 bean 之间的依赖关系。自动装配可以设

置在每个 bean 上，也可以设定在特定的 bean 上。

下面的 XML 配置文件表明了如何根据名称将一个 bean 设置

为自动装配：1. <bean id="employeeDAO"

class="com.howtodoinjava.EmployeeDAOImpl"

autowire="byName" />

除了 bean 配置文件中提供的自动装配模式，还可以使用

@Autowired 注解来自动装配指定的 bean。在使用

@Autowired 注解之前需要在按照如下的配置方式在 Spring

配置文件进行配置才可以使用。

\1. <context:annotation-config />

也可以通过在配置文件中配置

AutowiredAnnotationBeanPostProcessor 达到相同的效

果。

\1. <bean class

="org.springframework.beans.factory.annotation.Autowir

edAnnotationBeanPostProcessor"/>

配置好以后就可以使用@Autowired 来标注了。

\1. @Autowired

\2. public EmployeeDAOImpl ( EmployeeManager manager ) { 

\3. this.manager = manager;

\4. }17、请解释自动装配模式的区别？

在 Spring 框架中共有 5 种自动装配，让我们逐一分析。

\1. no：这是 Spring 框架的默认设置，在该设置下自动装配是关

闭的，开发者需要自行在 bean 定义中用标签明确的设置依赖

关系。

\2. byName：该选项可以根据 bean 名称设置依赖关系。当向一

个 bean 中自动装配一个属性时，容器将根据 bean 的名称自

动在在配置文件中查询一个匹配的 bean。如果找到的话，就

装配这个属性，如果没找到的话就报错。

\3. byType：该选项可以根据 bean 类型设置依赖关系。当向一个

bean 中自动装配一个属性时，容器将根据 bean 的类型自动

在在配置文件中查询一个匹配的 bean。如果找到的话，就装

配这个属性，如果没找到的话就报错。

\4. constructor：造器的自动装配和 byType 模式类似，但是仅

仅适用于与有构造器相同参数的 bean，如果在容器中没有找

到与构造器参数类型一致的 bean，那么将会抛出异常。

\5. autodetect：该模式自动探测使用构造器自动装配或者

byType 自动装配。首先，首先会尝试找合适的带参数的构造

器，如果找到的话就是用构造器自动装配，如果在 bean 内部

没有找到相应的构造器或者是无参构造器，容器就会自动选择

byTpe 的自动装配方式。18、如何开启基于注解的自动装配？

要使用 @Autowired，需要注册

AutowiredAnnotationBeanPostProcessor，可以有以下两

种方式来实现：

1、引入配置文件中的下引入

\1. <beans>

\2. <context:annotation-config />

\3. </beans>

2、在 bean 配置文件中直接引入

AutowiredAnnotationBeanPostProcessor

\1. <beans>

\2. <bean

class="org.springframework.beans.factory.annotation.Au

towiredAnnotationBeanPostProcessor"/>

\3. </beans>

19、请举例解释@Required 注解？

在产品级别的应用中，IoC 容器可能声明了数十万了 bean，

bean 与 bean 之间有着复杂的依赖关系。设值注解方法的短板之一就是验证所有的属性是否被注解是一项十分困难的操

作。可以通过在中设置“dependency-check”来解决这个问

题。

在应用程序的生命周期中，你可能不大愿意花时间在验证所有

bean 的属性是否按照上下文文件正确配置。或者你宁可验证

某个 bean 的特定属性是否被正确的设置。即使是用

“dependency-check”属性也不能很好的解决这个问题，在

这种情况下，你需要使用@Required 注解。

需要用如下的方式使用来标明 bean 的设值方法。

\1. public class EmployeeFactoryBean extends

AbstractFactoryBean<Object> 

\2. { 

\3. private String designation;

4.

\5. public String getDesignation() { 

\6. return designation;

\7. } 

8.

\9. @Required10.

 public void setDesignation(String

designation) {

11.

 this.designation = designation;

12.

 }

13.

14.

 //more code here

\15. 

}

RequiredAnnotationBeanPostProcessor 是 Spring 中的后

置处理用来验证被@Required 注解的 bean 属性是否被正确

的设置了。在使用 RequiredAnnotationBeanPostProcesso

来验证 bean 属性之前，首先要在 IoC 容器中对其进行注册：

\1. <bean

class="org.springframework.beans.factory.annotation.Re

quiredAnnotationBeanPostProcessor" />

但是如果没有属性被用 @Required 注解过的话，后置处理

器会抛出一个 BeanInitializationException 异常。

20、请举例解释@Autowired 注解？

@Autowired 注解对自动装配何时何处被实现提供了更多细粒

度的控制。@Autowired 注解可以像@Required 注解、构造器一样被用于在 bean 的设值方法上自动装配 bean 的属性，

一个参数或者带有任意名称或带有多个参数的方法。

比如，可以在设值方法上使用@Autowired 注解来替代配置文

件中的元素。当 Spring 容器在 setter 方法上找到

@Autowired 注解时，会尝试用 byType 自动装配。

当然我们也可以在构造方法上使用@Autowired 注解。带有

@Autowired 注解的构造方法意味着在创建一个 bean 时将会

被自动装配，即便在配置文件中使用 元素。

\1. public class TextEditor { 

\2. private SpellChecker spellChecker;

3.

\4. @Autowired

\5. public TextEditor(SpellChecker spellChecker){

\6. System.out.println("Inside TextEditor

constructor." );

\7. this.spellChecker = spellChecker;

\8. } 

9.

10.

 public void spellCheck(){

11.

 spellChecker.checkSpelling();12.

 }

\13. 

}

下面是没有构造参数的配置方式：

\1. <beans>

2.

\3. <context:annotation-config/>

4.

\5. <!-- Definition for textEditor bean without

constructor-arg -->

\6. <bean id="textEditor"

class="com.howtodoinjava.TextEditor"> 

\7. </bean>

8.

\9. <!-- Definition for spellChecker bean -->

10.

 <bean id="spellChecker"

class="com.howtodoinjava.SpellChecker">

11.

 </bean>

12.

\13. 

</beans>

21、请举例说明@Qualifier 注解？@Qualifier 注解意味着可以在被标注 bean 的字段上可以自动

装配。Qualifier 注解可以用来取消 Spring 不能取消的 bean

应用。

下面的示例将会在 Customer 的 person 属性中自动装配

person 的值。

\1. public class Customer

\2. { 

\3. @Autowired

\4. private Person person;

\5. }

下面我们要在配置文件中来配置 Person 类。

\1. <bean id="customer"

class="com.howtodoinjava.common.Customer" />

2.

\3. <bean id="personA"

class="com.howtodoinjava.common.Person" > 

\4. <property name="name" value="lokesh" />

\5. </bean>

6.7. <bean id="personB"

class="com.howtodoinjava.common.Person" > 

\8. <property name="name" value="alex" />

\9. </bean>

Spring 会知道要自动装配哪个 person bean 么？不会的，但

是运行上面的示例时，会抛出下面的异常：

\1. Caused by:

org.springframework.beans.factory.NoSuchBeanDefinition

Exception: 

\2. No unique bean of type

[com.howtodoinjava.common.Person] is defined: 

\3. expected single matching bean but found 2:

[personA, personB]

要解决上面的问题，需要使用 @Quanlifier 注解来告诉

Spring 容器要装配哪个 bean： 

\1. public class Customer

\2. { 

\3. @Autowired

\4. @Qualifier("personA") 

\5. private Person person;6. }

22、构造方法注入和设值注入有什么区别？

请注意以下明显的区别：

\1. 在设值注入方法支持大部分的依赖注入，如果我们仅需要注入

int、string 和 long 型的变量，我们不要用设值的方法注入。

对于基本类型，如果我们没有注入的话，可以为基本类型设置

默认值。在构造方法注入不支持大部分的依赖注入，因为在调

用构造方法中必须传入正确的构造参数，否则的话为报错。

\2. 设值注入不会重写构造方法的值。如果我们对同一个变量同时

使用了构造方法注入又使用了设置方法注入的话，那么构造方

法将不能覆盖由设值方法注入的值。很明显，因为构造方法尽

在对象被创建时调用。

\3. 在使用设值注入时有可能还不能保证某种依赖是否已经被注

入，也就是说这时对象的依赖关系有可能是不完整的。而在另

一种情况下，构造器注入则不允许生成依赖关系不完整的对

象。

\4. 在设值注入时如果对象 A 和对象 B 互相依赖，在创建对象 A 

时 Spring 会抛出 sObjectCurrentlyInCreationException 异

常，因为在 B 对象被创建之前 A 对象是不能被创建的，反之亦然。所以 Spring 用设值注入的方法解决了循环依赖的问题，

因对象的设值方法是在对象被创建之前被调用的。

23、Spring 框架中有哪些不同类型的事件？

Spring 的 ApplicationContext 提供了支持事件和代码中监

听器的功能。 我们可以创建 bean 用来监听在

ApplicationContext 中发布的事件。ApplicationEvent 类和

在 ApplicationContext 接口中处理的事件，如果一个 bean

实现了 ApplicationListener 接口，当一个 ApplicationEvent

被发布以后，bean 会自动被通知。

\1. public class AllApplicationEventListener implements

ApplicationListener < ApplicationEvent > 

\2. { 

\3. @Override

\4. public void onApplicationEvent(ApplicationEvent

applicationEvent)

\5. { 

\6. //process event

\7. } 

\8. }

Spring 提供了以下 5 中标准的事件：1. 上下文更新事件（ContextRefreshedEvent）：该事件会在

ApplicationContext 被初始化或者更新时发布。也可以在调

用 ConfigurableApplicationContext 接口中的 refresh()方

法时被触发。

\2. 上下文开始事件（ContextStartedEvent）：当容器调用

ConfigurableApplicationContext 的 Start()方法开始/重新开

始容器时触发该事件。

\3. 上下文停止事件（ContextStoppedEvent）：当容器调用

ConfigurableApplicationContext 的 Stop()方法停止容器时

触发该事件。

\4. 上下文关闭事件（ContextClosedEvent）：当

ApplicationContext 被关闭时触发该事件。容器被关闭时，

其管理的所有单例 Bean 都被销毁。

\5. 请求处理事件（RequestHandledEvent）：在 Web 应用中，

当一个 http 请求（request）结束触发该事件。

除了上面介绍的事件以外，还可以通过扩展

ApplicationEvent 类来开发自定义的事件。

\1. public class CustomApplicationEvent extends

ApplicationEvent

\2. {3. public CustomApplicationEvent ( Object source, final

String msg ) 

\4. { 

\5. super(source);

\6. System.out.println("Created a Custom event");

\7. } 

\8. }

为了监听这个事件，还需要创建一个监听器：

\1. public class CustomEventListener implements

ApplicationListener < CustomApplicationEvent > 

\2. { 

\3. @Override

\4. public void

onApplicationEvent(CustomApplicationEvent

applicationEvent) { 

\5. //handle event

\6. } 

\7. }

之后通过 applicationContext 接口的 publishEvent()方法来

发布自定义事件。1. CustomApplicationEvent customEvent = new

CustomApplicationEvent(applicationContext, "Test

message");

\2. applicationContext.publishEvent(customEvent);

24、FileSystemResource 和 ClassPathResource 有何区别？

在 FileSystemResource 中需要给出 spring-config.xml 文件

在你项目中的相对路径或者绝对路径。在 ClassPathResource

中 spring 会在 ClassPath 中自动搜寻配置文件，所以要把

ClassPathResource 文件放在 ClassPath 下。

如果将 spring-config.xml 保存在了 src 文件夹下的话，只需

给出配置文件的名称即可，因为 src 文件夹是默认。

简而言之，ClassPathResource 在环境变量中读取配置文件，

FileSystemResource 在配置文件中读取配置文件。

25、Spring 框架中都用到了哪些设计模式？

Spring 框架中使用到了大量的设计模式，下面列举了比较有

代表性的：

\1. 代理模式—在 AOP 和 remoting 中被用的比较多。2. 单例模式—在 spring 配置文件中定义的 bean 默认为单例模

式。

\3. 模板方法—用来解决代码重复的问题。比如. RestTemplate,

JmsTemplate, JpaTemplate。 

\4. 前端控制器—Spring 提供了 DispatcherServlet 来对请求进行

分发。

\5. 视图帮助(View Helper )—Spring 提供了一系列的 JSP 标签，

高效宏来辅助将分散的代码整合在视图里。

\6. 依赖注入—贯穿于 BeanFactory / ApplicationContext 接口

的核心理念。

\7. 工厂模式—BeanFactory 用来创建对象的实例。





------

1.谈谈你对 spring IOC 和 DI 的理解，它们有什么区别？

 I o C I n v e r s e o f C o n t r o l 反 转 控 制 的 概 念 ， 就 是

将 原 本 在 程 序 中 手 动 创 建 U s e r S e r v i c e 对 象 的 控

制 权 ， 交 由 S p r i n g 框 架 管 理 ， 简 单 说 ， 就 是 创

建 U s e r S e r v i c e 对 象 控 制 权 被 反 转 到 了 S p r i n g

框 架

 D I： D e p e n d e n c y 

I n j e c t i o n 

依 赖 注 入 ， 在

S p r i n g 框 架 负 责 创 建 B e a n 对 象 时 ， 动 态 的 将 依

赖 对 象 注 入 到 B e a n 组 件

面 试 题 ： I o C 和 D I 的 区 别 ？

I o C 控 制 反 转 ， 指 将 对 象 的 创 建 权 ， 反 转 到

S p r i n g 容 器 ， D I 依 赖 注 入 ， 指 S p r i n g 创 建

对 象 的 过 程 中 ， 将 对 象 依 赖 属 性 通 过 配 置 进 行 注

入

2.BeanFactory 接口和 ApplicationContext 接口有什么区

别 ？-① A p p l i c a t i o n C o n t e x t 接 口 继 承 B e a n F a c t o r y

接 口 ， S p r i n g 核 心 工 厂 是

B e a n F a c t o r y , B e a n F a c t o r y 采 取 延 迟 加 载 ， 第

一 次 g e t B e a n 时 才 会 初 始 化 B e a n ,

A p p l i c a t i o n C o n t e x t 是 会 在 加 载 配 置 文 件 时 初

始 化 B e a n。 

 ② A p p l i c a t i o n C o n t e x t 是 对 B e a n F a c t o r y 扩

展 ， 它 可 以 进 行 国 际 化 处 理 、 事 件 传 递 和 b e a n

自 动 装 配 以 及 各 种 不 同 应 用 层 的 C o n t e x t 实 现

 开 发 中 基 本 都 在 使 用 A p p l i c a t i o n C o n t e x t , w e b

项 目 使 用 W e b A p p l i c a t i o n C o n t e x t ， 很 少 用 到

B e a n F a c t o r y

1 . 

B e a n F a c t o r y b e a n F a c t o r y = n e w

X m l B e a n F a c t o r y ( n e w

C l a s s P a t h R e s o u r c e ( " a p p l i c a t i o n C o n t e x t . x m l "

) ) ;

2 . 

I H e l l o S e r v i c e h e l l o S e r v i c e = 

( I H e l l o S e r v i c e )

b e a n F a c t o r y . g e t B e a n ( " h e l l o S e r v i c e " ) ;

3 . 

h e l l o S e r v i c e . s a y H e l l o ( ) ;

3.spring 配置 bean 实例化有哪些方式？ 1） 使 用 类 构 造 器 实 例 化 (默 认 无 参 数 ) 

1 . 

< b e a n i d = " b e a n 1 "

c l a s s = " c n . i t c a s t . s p r i n g . b _ i n s t a n c e . B e a n 1 " >

< / b e a n >

 2） 使 用 静 态 工 厂 方 法 实 例 化 (简 单 工 厂 模 式 ) 

1 . 

/ /下 面 这 段 配 置 的 含 义 ： 调 用 B e a n 2 F a c t o r y

的 g e t B e a n 2 方 法 得 到 b e a n 2

2 . 

< b e a n i d = " b e a n 2 "

c l a s s = " c n . i t c a s t . s p r i n g . b _ i n s t a n c e . B e a n 2 F a

c t o r y " f a c t o r y - m e t h o d = " g e t B e a n 2 " > < / b e a n >

 3） 使 用 实 例 工 厂 方 法 实 例 化 (工 厂 方 法 模 式 ) 

1 . 

/ /先 创 建 工 厂 实 例 b e a n 3 F a c o r y， 再 通 过 工

厂 实 例 创 建 目 标 b e a n 实 例

2 . 

< b e a n i d = " b e a n 3 F a c t o r y "

c l a s s = " c n . i t c a s t . s p r i n g . b _ i n s t a n c e . B e a n 3 F a

c t o r y " > < / b e a n >

3 . 

< b e a n i d = " b e a n 3 " f a c t o r y -

b e a n = " b e a n 3 F a c t o r y " f a c t o r y -

m e t h o d = " g e t B e a n 3 " > < / b e a n >

4.简单的说一下 spring 的生命周期？1 . 

1 )在 配 置 < b e a n > 元 素 ， 通 过 i n i t - m e t h o d

指 定 B e a n 的 初 始 化 方 法 ， 通 过 d e s t r o y - m e t h o d

指 定 B e a n 销 毁 方 法

< b e a n i d = " l i f e c y c l e b e a n " c l a s s = " c n . i t c a s t . s p r i

n g . d _ l i f e c y c l e . l i f e c y c l e b e a n " i n i t -

m e t h o d = " s e t u p " d e s t r o y -

m e t h o d = " t e a r d o w n " >需 要 注 意 的 问 题 ：

< / b e a n i d = " l i f e c y c l e b e a n " c l a s s = " c n . i t c a s t . s p

r i n g . d _ l i f e c y c l e . l i f e c y c l e b e a n " i n i t -

m e t h o d = " s e t u p " d e s t r o y -

m e t h o d = " t e a r d o w n " >

1 . 

\* d e s t r o y - m e t h o d 只 对

s c o p e = " s i n g l e t o n " 有 效

2 . 

3 . 

\* 销 毁 方 法 ， 必 须 关 闭

A p p l i c a t i o n C o n t e x t 对 象 (手 动 调 用 )， 才 会 被 调

用 

1 . 

C l a s s P a t h X m l A p p l i c a t i o n C o n t e x t

a p p l i c a t i o n C o n t e x t = n e w

C l a s s P a t h X m l A p p l i c a t i o n C o n t e x t ( " a p p l i c a t i o

n C o n t e x t . x m l " ) ;2 . 

a p p l i c a t i o n C o n t e x t . c l o s e ( ) ;

2 ) B e a n 的 完 整 生 命 周 期 （ 十 一 步 骤 ） 【 了 解 内

容 ， 但 是 对 于 s p r i n g 内 部 操 作 理 解 有 一 定 帮

助 】

① i n s t a n t i a t e b e a n 对 象 实 例 化

② p o p u l a t e p r o p e r t i e s 封 装 属 性

③ 如 果 B e a n 实 现 B e a n N a m e A w a r e 

执 行

s e t B e a n N a m e

④ 如 果 B e a n 实 现 B e a n F a c t o r y A w a r e 

或 者

A p p l i c a t i o n C o n t e x t A w a r e 

设 置 工 厂

s e t B e a n F a c t o r y 

或 者 上 下 文 对 象

s e t A p p l i c a t i o n C o n t e x t

⑤ 如 果 存 在 类 实 现 

B e a n P o s t P r o c e s s o r（ 后 处

理 B e a n） 

， 执 行

p o s t P r o c e s s B e f o r e I n i t i a l i z a t i o n，

B e a n P o s t P r o c e s s o r 接 口 提 供 钩 子 函 数 ， 用 来 动

态 扩 展 修 改 B e a n。 (程 序 自 动 调 用 后 处 理 B e a n )1 . 

p u b l i c c l a s s M y B e a n P o s t P r o c e s s o r i m p l e m e n t

s B e a n P o s t P r o c e s s o r {

2 . 

p u b l i c O b j e c t

p o s t P r o c e s s A f t e r I n i t i a l i z a t i o n ( O b j e c t

b e a n , S t r i n g b e a n N a m e )

3 . 

t h r o w s B e a n s E x c e p t i o n {

4 . 

S y s t e m . o u t . p r i n t l n ( "第 八 步 ： 后 处 理

B e a n， a f t e r 初 始 化 。 " ) ;

5 . 

/ /后 处 理 B e a n， 在 这 里 加 上 一 个 动 态 代 理 ，

就 把 这 个 B e a n 给 修 改 了 。

6 . 

r e t u r n b e a n ; / /返 回 b e a n， 表 示 没 有 修 改 ，

如 果 使 用 动 态 代 理 ， 返 回 代 理 对 象 ， 那 么 就 修 改

了 。

7 . 

} 

8 . 

p u b l i c O b j e c t

p o s t P r o c e s s B e f o r e I n i t i a l i z a t i o n ( O b j e c t

b e a n , S t r i n g b e a n N a m e )

9 . 

t h r o w s B e a n s E x c e p t i o n {

1 0 . 

S y s t e m . o u t . p r i n t l n ( "第 五 步 ： 后 处 理 B e a n

的 ： b e f o r e 初 始 化 ！ ！ " ) ;

1 1 . 

/ /后 处 理 B e a n， 在 这 里 加 上 一 个 动 态 代 理 ，

就 把 这 个 B e a n 给 修 改 了 。1 2 . 

r e t u r n b e a n ; / /返 回 b e a n 本 身 ， 表 示 没 有 修

改 。

1 3 . 

}

1 4 . 

}

**注 意 ： 这 个 前 处 理 B e a n 和 后 处 理 B e a n 会 对 所**

**有 的 B e a n 进 行 拦 截 。**

⑥ 如 果 B e a n 实 现 I n i t i a l i z i n g B e a n 

执 行

a f t e r P r o p e r t i e s S e t

⑦ 调 用 指 定 初 始 化 方 法 i n i t

⑧ 如 果 存 在 类 实 现 

B e a n P o s t P r o c e s s o r（ 处 理

B e a n） ， 执 行 p o s t P r o c e s s A f t e r I n i t i a l i z a t i o n

⑨ 执 行 业 务 处 理

⑩ 如 果 B e a n 实 现 

D i s p o s a b l e B e a n 

执 行

d e s t r o y

⑪调 用 指 定 销 毁 方 法 c u s t o m e r D e s t r o y5.请介绍一下 Spring 框架中 Bean 的生命周期和作用域

( 1 ) b e a n 定 义

1 . 

在 配 置 文 件 里 面 用 < b e a n > < / b e a n >来 进 行 定

义 。

( 2 ) b e a n 初 始 化

1 . 

有 两 种 方 式 初 始 化 :

A .在 配 置 文 件 中 通 过 指 定 i n i t - m e t h o d 属 性 来 完

成

B .实 现

o r g . s p r i n g f r a m w o r k . b e a n s . f a c t o r y . I n i t i a l i z i n

g B e a n 接 口

( 3 ) b e a n 调 用

1 . 

有 三 种 方 式 可 以 得 到 b e a n 实 例 ， 并 进 行 调 用

( 4 ) b e a n 销 毁

1 . 

销 毁 有 两 种 方 式

A .使 用 配 置 文 件 指 定 的 d e s t r o y - m e t h o d 属 性B .实 现

o r g . s p r i n g f r a m w o r k . b e a n . f a c t o r y . D i s p o s e a b l

e B e a n 接 口

**# #作 用 域**

**s i n g l e t o n**

当 一 个 b e a n 的 作 用 域 为 s i n g l e t o n , 那 么

S p r i n g I o C 容 器 中 只 会 存 在 一 个 共 享 的 b e a n 实

例 ， 并 且 所 有 对 b e a n 的 请 求 ， 只 要 i d 与 该

b e a n 定 义 相 匹 配 ， 则 只 会 返 回 b e a n 的 同 一 实

例 。

**p r o t o t y p e**

P r o t o t y p e 作 用 域 的 b e a n 会 导 致 在 每 次 对 该

b e a n 请 求 （ 将 其 注 入 到 另 一 个 b e a n 中 ， 或 者 以

程 序 的 方 式 调 用 容 器 的 g e t B e a n ( ) 方 法 ） 时 都

会 创 建 一 个 新 的 b e a n 实 例 。 根 据 经 验 ， 对 所 有

有 状 态 的 b e a n 应 该 使 用 p r o t o t y p e 作 用 域 ， 而

对 无 状 态 的 b e a n 则 应 该 使 用 s i n g l e t o n 作 用 域

**r e q u e s t**在 一 次 H T T P 请 求 中 ， 一 个 b e a n 定 义 对 应 一 个

实 例 ； 即 每 次 H T T P 请 求 将 会 有 各 自 的 b e a n 实

例 ， 它 们 依 据 某 个 b e a n 定 义 创 建 而 成 。 该 作

用 域 仅 在 基 于 w e b 的 S p r i n g

A p p l i c a t i o n C o n t e x t 情 形 下 有 效 。

**s e s s i o n**

在 一 个 H T T P S e s s i o n 中 ， 一 个 b e a n 定 义 对 应

一 个 实 例 。 该 作 用 域 仅 在 基 于 w e b 的 S p r i n g

A p p l i c a t i o n C o n t e x t 情 形 下 有 效 。

**g l o b a l s e s s i o n**

在 一 个 全 局 的 H T T P S e s s i o n 中 ， 一 个 b e a n 定

义 对 应 一 个 实 例 。 典 型 情 况 下 ， 仅 在 使 用

p o r t l e t c o n t e x t 的 时 候 有 效 。 该 作 用 域 仅 在 基

于 w e b 的 S p r i n g A p p l i c a t i o n C o n t e x t 情 形 下

有 效 。

6.Bean 注入属性有哪几种方式？

s p r i n g 支 持 构 造 器 注 入 和 s e t t e r 方 法 注 入构 造 器 注 入 ， 通 过 元 素 完 成 注 入 s e t t e r 方 法 注

入 ， 通 过 元 素 完 成 注 入 【 开 发 中 常 用 方 式 】

7.什么是 AOP，AOP 的作用是什么？

面 向 切 面 编 程 （ A O P） 提 供 另 外 一 种 角 度 来 思 考

程 序 结 构 ， 通 过 这 种 方 式 弥 补 了 面 向 对 象 编 程

（ O O P） 的 不 足 ， 除 了 类 （ c l a s s e s） 以 外 ， A O P

提 供 了 切 面 。 切 面 对 关 注 点 进 行 模 块 化 ， 例 如 横

切 多 个 类 型 和 对 象 的 事 务 管 理

S p r i n g 的 一 个 关 键 的 组 件 就 是 A O P 框 架 ， 可 以

自 由 选 择 是 否 使 用 A O P 提 供 声 明 式 企 业 服 务 ，

特 别 是 为 了 替 代 E J B 声 明 式 服 务 。 最 重 要 的 服 务

是 声 明 性 事 务 管 理 ， 这 个 服 务 建 立 在 S p r i n g 的

抽 象 事 物 管 理 之 上 。 允 许 用 户 实 现 自 定 义 切 面 ，

用 A O P 来 完 善 O O P 的 使 用 ,可 以 把 S p r i n g A O P

看 作 是 对 S p r i n g 的 一 种 增 强

8.Spring 的核心类有哪些，各有什么作用？

 B e a n F a c t o r y： 产 生 一 个 新 的 实 例 ， 可 以 实 现 单

例 模 式 B e a n W r a p p e r： 提 供 统 一 的 g e t 及 s e t 方 法

 A p p l i c a t i o n C o n t e x t :提 供 框 架 的 实 现 ， 包 括

B e a n F a c t o r y 的 所 有 功 能

9.Spring 里面如何配置数据库驱动？

使 用 ”

o r g . s p r i n g f r a m e w o r k . j d b c . d a t a s o u r c e . D r i v e r

M a n a g e r D a t a S o u r c e” 数 据 源 来 配 置 数 据 库 驱

动 。 示 例 如 下 ：

o r g . h s q l d b . j d b c D r i v e r j d b c : h s q l d b : d b / a p p f u s

e a b c a b c

10.Spring 里面 applicationContext.xml 文件能不能改成其他

文件名？

C o n t e x t L o a d e r L i s t e n e r 是 一 个

S e r v l e t C o n t e x t L i s t e n e r , 它 在 你 的 w e b 应 用 启

动 的 时 候 初 始 化 。 缺 省 情 况 下 ， 它 会 在 W E B -

I N F / a p p l i c a t i o n C o n t e x t . x m l 文 件 找 S p r i n g 的

配 置 。 你 可 以 通 过 定 义 一 个 元 素 名 字 为 ”

c o n t e x t C o n f i g L o c a t i o n” 来 改 变 S p r i n g 配 置 文

件 的 位 置 。 示 例 如 下 ：1 . 

< l i s t e n e r >

2 .

 < l i s t e n e r -

c l a s s > o r g . s p r i n g f r a m e w o r k . w e b . c o n t e x t . C o n t

e x t L o a d e r L i s t e n e r

3 .

 < c o n t e x t - p a r a m >

4 .

 < p a r a m -

n a m e > c o n t e x t C o n f i g L o c a t i o n < / p a r a m - n a m e >

5 .

 < p a r a m - v a l u e > / W E B -

I N F / x y z . x m l < / p a r a m - v a l u e >

6 .

 < / c o n t e x t - p a r a m > 

7 .

 < / l i s t e n e r - c l a s s >

8 . 

< / l i s t e n e r >

11.Spring 里面如何定义 hibernate mapping？

添 加 h i b e r n a t e m a p p i n g 文 件 到 w e b / W E B -

I N F 目 录 下 的 a p p l i c a t i o n C o n t e x t . x m l 文 件 里

面 。 示 例 如 下 ：

1 . 

< p r o p e r t y n a m e =” m a p p i n g R e s o u r c e s”> 

2 .

 < l i s t >3 .

 

< v a l u e > o r g / a p p f u s e / m o d e l / U s e r . h b m . x m l < / v a l

u e >

4 .

 < / l i s t >

5 . 

< / p r o p e r t y >

12.Spring 如何处理线程并发问题？

 S p r i n g 使 用 T h r e a d L o c a l 解 决 线 程 安 全 问 题

 我 们 知 道 在 一 般 情 况 下 ， 只 有 无 状 态 的 B e a n 才

可 以 在 多 线 程 环 境 下 共 享 ， 在 S p r i n g 中 ， 绝 大

部 分 B e a n 都 可 以 声 明 为 s i n g l e t o n 作 用 域 。 就

是 因 为 S p r i n g 对 一 些 B e a n (如

R e q u e s t C o n t e x t H o l d e r、

T r a n s a c t i o n S y n c h r o n i z a t i o n M a n a g e r、

L o c a l e C o n t e x t H o l d e r 等 )中 非 线 程 安 全 状 态 采

用 T h r e a d L o c a l 进 行 处 理 ， 让 它 们 也 成 为 线 程 安

全 的 状 态 ， 因 为 有 状 态 的 B e a n 就 可 以 在 多 线 程

中 共 享 了 。

 T h r e a d L o c a l 和 线 程 同 步 机 制 都 是 为 了 解 决 多 线

程 中 相 同 变 量 的 访 问 冲 突 问 题 。

 在 同 步 机 制 中 ， 通 过 对 象 的 锁 机 制 保 证 同 一 时 间

只 有 一 个 线 程 访 问 变 量 。 这 时 该 变 量 是 多 个 线 程共 享 的 ， 使 用 同 步 机 制 要 求 程 序 慎 密 地 分 析 什 么

时 候 对 变 量 进 行 读 写 ， 什 么 时 候 需 要 锁 定 某 个 对

象 ， 什 么 时 候 释 放 对 象 锁 等 繁 杂 的 问 题 ， 程 序 设

计 和 编 写 难 度 相 对 较 大 。

 而 T h r e a d L o c a l 则 从 另 一 个 角 度 来 解 决 多 线 程 的

并 发 访 问 。 T h r e a d L o c a l 会 为 每 一 个 线 程 提 供 一

个 独 立 的 变 量 副 本 ， 从 而 隔 离 了 多 个 线 程 对 数 据

的 访 问 冲 突 。 因 为 每 一 个 线 程 都 拥 有 自 己 的 变 量

副 本 ， 从 而 也 就 没 有 必 要 对 该 变 量 进 行 同 步 了 。

T h r e a d L o c a l 提 供 了 线 程 安 全 的 共 享 对 象 ， 在 编

写 多 线 程 代 码 时 ， 可 以 把 不 安 全 的 变 量 封 装 进

T h r e a d L o c a l。 

 由 于 T h r e a d L o c a l 中 可 以 持 有 任 何 类 型 的 对 象 ，

低 版 本 J D K 所 提 供 的 g e t ( )返 回 的 是 O b j e c t 对

象 ， 需 要 强 制 类 型 转 换 。 但 J D K 5 . 0 通 过 泛 型 很

好 的 解 决 了 这 个 问 题 ， 在 一 定 程 度 地 简 化

T h r e a d L o c a l 的 使 用 。

 概 括 起 来 说 ， 对 于 多 线 程 资 源 共 享 的 问 题 ， 同 步

机 制 采 用 了 “ 以 时 间 换 空 间 ” 的 方 式 ， 而

T h r e a d L o c a l 采 用 了 “ 以 空 间 换 时 间 ” 的 方 式 。

前 者 仅 提 供 一 份 变 量 ， 让 不 同 的 线 程 排 队 访 问 ，而 后 者 为 每 一 个 线 程 都 提 供 了 一 份 变 量 ， 因 此 可

以 同 时 访 问 而 互 不 影 响 。

13.为什么要有事物传播行为？

1 4 .介 绍 一 下 S p r i n g 的 事 物 管 理 事 务 就 是 对 一 系

列 的 数 据 库 操 作 （ 比 如 插 入 多 条 数 据 ） 进 行 统 一

的 提 交 或 回 滚 操 作 ， 如 果 插 入 成 功 ， 那 么 一 起 成

功 ， 如 果 中 间 有 一 条 出 现 异 常 ， 那 么 回 滚 之 前 的

所 有 操 作 。 这 样 可 以 防 止 出 现 脏 数 据 ， 防 止 数 据

库 数 据 出 现 问 题 。

开 发 中 为 了 避 免 这 种 情 况 一 般 都 会 进 行 事 务 管

理 。 S p r i n g 中 也 有 自 己 的 事 务 管 理 机 制 ， 一 般 是

使 用 T r a n s a c t i o n M a n a n g e r 进 行 管 理 ， 可 以 通

过 S p r i n g 的 注 入 来 完 成 此 功 能 。 s p r i n g 提 供 了

几 个 关 于 事 务 处 理 的 类 ：

 T r a n s a c t i o n D e f i n i t i o n / /事 务 属 性 定 义

 T r a n s c a t i o n S t a t u s / /代 表 了 当 前 的 事 务 ， 可 以

提 交 ， 回 滚 。

 P l a t f o r m T r a n s a c t i o n M a n a g e r 这 个 是 s p r i n g

提 供 的 用 于 管 理 事 务 的 基 础 接 口 ， 其 下 有 一 个 实现 的 抽 象 类

A b s t r a c t P l a t f o r m T r a n s a c t i o n M a n a g e r ,我 们 使

用 的 事 务 管 理 类 例 如

D a t a S o u r c e T r a n s a c t i o n M a n a g e r 等 都 是 这 个 类

的 子 类 。

一 般 事 务 定 义 步 骤 ：

1 . 

T r a n s a c t i o n D e f i n i t i o n t d

= n e w T r a n s a c t i o n D e f i n i t i o n ( ) ;

2 . 

T r a n s a c t i o n S t a t u s t s =

t r a n s a c t i o n M a n a g e r . g e t T r a n s a c t i o n ( t d ) ;

3 . 

t r y { 

4 .

 / / d o s t h

5 .

 t r a n s a c t i o n M a n a g e r . c o m m i t ( t s ) ;

6 . 

} c a t c h ( E x c e p t i o n e ) {

7 .

 t r a n s a c t i o n M a n a g e r . r o l l b a c k ( t s ) ;

8 . 

}

s p r i n g 提 供 的 事 务 管 理 可 以 分 为 两 类 ： 编 程 式 的

和 声 明 式 的 。 编 程 式 的 ， 比 较 灵 活 ， 但 是 代 码 量

大 ， 存 在 重 复 的 代 码 比 较 多 ； 声 明 式 的 比 编 程 式

的 更 灵 活 。编 程 式 主 要 使 用 t r a n s a c t i o n T e m p l a t e。 省 略 了

部 分 的 提 交 ， 回 滚 ， 一 系 列 的 事 务 对 象 定 义 ， 需

注 入 事 务 管 理 对 象 . 

1 . 

v o i d a d d ( ) {

2 .

 

t r a n s a c t i o n T e m p l a t e . e x e c u t e ( n e w T r a n s a c t i o n

C a l l b a c k ( ) {

3 .

 p u l i c O b j e c t

d o I n T r a n s a c t i o n ( T r a n s a c t i o n S t a t u s t s ) {

4 .

 / / d o s t h

5 .

 } 

6 .

 } 

7 . 

}

声 明 式 ：

使 用

T r a n s a c t i o n P r o x y F a c t o r y B e a n : P R O P A G A T I O N

R E Q U I R E D P R O P A G A T I O N R E Q U I R E D

P R O P A G A T I O N _ R E Q U I R E D , r e a d O n l y围 绕 P o x y 的 动 态 代 理 能 够 自 动 的 提 交 和 回 滚 事

务 

1 . 

o r g . s p r i n g f r a m e w o r k . t r a n s a c t i o n . i n t e r c e

p t o r . T r a n s a c t i o n P r o x y F a c t o r y B e a n

2 . 

3 . 

P R O P A G A T I O N _ R E Q U I R E D– 支 持 当 前 事 务 ， 如

果 当 前 没 有 事 务 ， 就 新 建 一 个 事 务 。 这 是 最 常 见

的 选 择 。

4 . 

5 . 

P R O P A G A T I O N _ S U P P O R T S– 支 持 当 前 事 务 ， 如

果 当 前 没 有 事 务 ， 就 以 非 事 务 方 式 执 行 。

6 . 

7 . 

P R O P A G A T I O N _ M A N D A T O R Y– 支 持 当 前 事 务 ， 如

果 当 前 没 有 事 务 ， 就 抛 出 异 常 。

8 . 

9 . 

P R O P A G A T I O N _ R E Q U I R E S _ N E W– 新 建 事 务 ， 如

果 当 前 存 在 事 务 ， 把 当 前 事 务 挂 起 。

1 0 .

1 1 . 

P R O P A G A T I O N _ N O T _ S U P P O R T E D– 以 非 事 务 方 式

执 行 操 作 ， 如 果 当 前 存 在 事 务 ， 就 把 当 前 事 务 挂

起 。1 2 .

1 3 . 

P R O P A G A T I O N _ N E V E R– 以 非 事 务 方 式 执 行 ， 如

果 当 前 存 在 事 务 ， 则 抛 出 异 常 。

1 4 .

1 5 . 

P R O P A G A T I O N _ N E S T E D– 如 果 当 前 存 在 事 务 ，

则 在 嵌 套 事 务 内 执 行 。 如 果 当 前 没 有 事 务 ， 则 进

行 与 P R O P A G A T I O N _ R E Q U I R E D 类 似 的 操 作 。

15.解释一下 Spring AOP 里面的几个名词

切 面 （ A s p e c t） ： 一 个 关 注 点 的 模 块 化 ， 这 个 关

注 点 可 能 会 横 切 多 个 对 象 。 事 务 管 理 是 J 2 E E 应

用 中 一 个 关 于 横 切 关 注 点 的 很 好 的 例 子 。 在

S p r i n g A O P 中 ， 切 面 可 以 使 用 通 用 类 （ 基 于 模

式 的 风 格 ） 或 者 在 普 通 类 中 以 @ A s p e c t 注 解

（ @ A s p e c t J 风 格 ） 来 实 现 。

连 接 点 （ J o i n p o i n t） ： 在 程 序 执 行 过 程 中 某 个

特 定 的 点 ， 比 如 某 方 法 调 用 的 时 候 或 者 处 理 异 常

的 时 候 。 在 S p r i n g A O P 中 ， 一 个 连 接 点 总 是

代 表 一 个 方 法 的 执 行 。 通 过 声 明 一 个

o r g . a s p e c t j . l a n g . J o i n P o i n t 类 型 的 参 数 可 以 使

通 知 （ A d v i c e） 的 主 体 部 分 获 得 连 接 点 信 息 。通 知 （ A d v i c e） ： 在 切 面 的 某 个 特 定 的 连 接 点

（ J o i n p o i n t） 上 执 行 的 动 作 。 通 知 有 各 种 类

型 ， 其 中 包 括 “ a r o u n d” 、 “ b e f o r e” 和 

“ a f t e r” 等 通 知 。 通 知 的 类 型 将 在 后 面 部 分 进

行 讨 论 。 许 多 A O P 框 架 ， 包 括 S p r i n g， 都 是 以

拦 截 器 做 通 知 模 型 ， 并 维 护 一 个 以 连 接 点 为 中

心 的 拦 截 器 链 。

切 入 点 （ P o i n t c u t） ： 匹 配 连 接 点

（ J o i n p o i n t） 的 断 言 。 通 知 和 一 个 切 入 点 表 达

式 关 联 ， 并 在 满 足 这 个 切 入 点 的 连 接 点 上 运 行

（ 例 如 ， 当 执 行 某 个 特 定 名 称 的 方 法 时 ） 。 切

入 点 表 达 式 如 何 和 连 接 点 匹 配 是 A O P 的 核 心 ：

S p r i n g 缺 省 使 用 A s p e c t J 切 入 点 语 法 。

引 入 （ I n t r o d u c t i o n） ： （ 也 被 称 为 内 部 类 型 声

明 （ i n t e r - t y p e d e c l a r a t i o n） ） 。 声 明 额 外 的

方 法 或 者 某 个 类 型 的 字 段 。 S p r i n g 允 许 引 入 新

的 接 口 （ 以 及 一 个 对 应 的 实 现 ） 到 任 何 被 代 理 的

对 象 。 例 如 ， 你 可 以 使 用 一 个 引 入 来 使 b e a n 实 

现 I s M o d i f i e d 接 口 ， 以 便 简 化 缓 存 机 制 。目 标 对 象 （ T a r g e t O b j e c t） ： 被 一 个 或 者 多 个

切 面 （ a s p e c t） 所 通 知 （ a d v i s e） 的 对 象 。 也 有

人 把 它 叫 做 被 通 知 （ a d v i s e d） 对 象 。 既 然

S p r i n g A O P 是 通 过 运 行 时 代 理 实 现 的 ， 这 个 对

象 永 远 是 一 个 被 代 理 （ p r o x i e d） 对 象 。

A O P 代 理 （ A O P P r o x y） ： A O P 框 架 创 建 的 对

象 ， 用 来 实 现 切 面 契 约 （ a s p e c t c o n t r a c t） （ 包

括 通 知 方 法 执 行 等 功 能 ） 。 在 S p r i n g 中 ， A O P

代 理 可 以 是 J D K 动 态 代 理 或 者 C G L I B 代 理 。 注

意 ： S p r i n g 2 . 0 最 新 引 入 的 基 于 模 式 （ s c h e m a -

b a s e d） 风 格 和 @ A s p e c t J 注 解 风 格 的 切 面 声

明 ， 对 于 使 用 这 些 风 格 的 用 户 来 说 ， 代 理 的 创 建

是 透 明 的 。

织 入 （ W e a v i n g） ： 把 切 面 （ a s p e c t） 连 接 到 其

它 的 应 用 程 序 类 型 或 者 对 象 上 ， 并 创 建 一 个 被 通

知 （ a d v i s e d） 的 对 象 。 这 些 可 以 在 编 译 时 （ 例

如 使 用 A s p e c t J 编 译 器 ） ， 类 加 载 时 和 运 行 时 完

成 。 S p r i n g 和 其 他 纯 J a v a A O P 框 架 一 样 ， 在

运 行 时 完 成 织 入 。16.通知有哪些类型？

前 置 通 知 （ B e f o r e a d v i c e） ： 在 某 连 接 点 （ j o i n

p o i n t） 之 前 执 行 的 通 知 ， 但 这 个 通 知 不 能 阻 止

连 接 点 前 的 执 行 （ 除 非 它 抛 出 一 个 异 常 ） 。 返

回 后 通 知 （ A f t e r r e t u r n i n g a d v i c e） ： 在 某 连

接 点 （ j o i n p o i n t） 正 常 完 成 后 执 行 的 通 知 ： 例

如 ， 一 个 方 法 没 有 抛 出 任 何 异 常 ， 正 常 返 回 。

抛 出 异 常 后 通 知 （ A f t e r t h r o w i n g a d v i c e） ： 在

方 法 抛 出 异 常 退 出 时 执 行 的 通 知 。 后 通 知

（ A f t e r ( f i n a l l y ) a d v i c e） ： 当 某 连 接 点 退 出 的

时 候 执 行 的 通 知 （ 不 论 是 正 常 返 回 还 是 异 常 退

出 ） 。 环 绕 通 知 （ A r o u n d A d v i c e） ： 包 围 一

个 连 接 点 （ j o i n p o i n t） 的 通 知 ， 如 方 法 调 用 。

这 是 最 强 大 的 一 种 通 知 类 型 。 环 绕 通 知 可 以 在

方 法 调 用 前 后 完 成 自 定 义 的 行 为 。 它 也 会 选 择 是

否 继 续 执 行 连 接 点 或 直 接 返 回 它 们 自 己 的 返 回 值

或 抛 出 异 常 来 结 束 执 行 。

环 绕 通 知 是 最 常 用 的 一 种 通 知 类 型 。 大 部 分 基 于

拦 截 的 A O P 框 架 ， 例 如 N a n n i n g 和 J B o s s 4， 都

只 提 供 环 绕 通 知 。 切 入 点 （ p o i n t c u t） 和 连 接点 （ j o i n p o i n t） 匹 配 的 概 念 是 A O P 的 关 键 ， 这

使 得 A O P 不 同 于 其 它 仅 仅 提 供 拦 截 功 能 的 旧 技

术 。 切 入 点 使 得 定 位 通 知 （ a d v i c e） 可 独 立 于

O O 层 次 。 例 如 ， 一 个 提 供 声 明 式 事 务 管 理 的

a r o u n d 通 知 可 以 被 应 用 到 一 组 横 跨 多 个 对 象 中

的 方 法 上 （ 例 如 服 务 层 的 所 有 业 务 操 作 ） 。



------

 

**70 道 Spring 面试题** 

**1.什么是 spring?** 

Spring 是个 java 企业级应用的开源开发框架。Spring 主要用来开发 Java 应用，但是有些

扩展是针对构建 J2EE 平台的 web 应用。Spring 框架目标是简化 Java 企业级应用开发，并

通过 POJO 为基础的编程模型促进良好的编程习惯。

**2.使用 Spring 框架的好处是什么？** 

 **轻量：**Spring 是轻量的，基本的版本大约 2MB。 

 **控制反转：**Spring 通过控制反转实现了松散耦合，对象们给出它们的依赖，而不是创建

或查找依赖的对象们。

 **面向切面的编程(AOP)：**Spring 支持面向切面的编程，并且把应用业务逻辑和系统服务

分开。

 **容器：**Spring 包含并管理应用中对象的生命周期和配置。

 **MVC 框架**：Spring 的 WEB 框架是个精心设计的框架，是 Web 框架的一个很好的替代品。

 **事务管理：**Spring 提供一个持续的事务管理接口，可以扩展到上至本地事务下至全局事

务（JTA）。

 **异常处理：**Spring 提供方便的 API 把具体技术相关的异常（比如由 JDBC，HibernateorJDO

抛出的）转化为一致的 unchecked 异常。

**3.Spring 由哪些模块组成?** 

以下是 Spring 框架的基本模块：

 Coremodule

 Beanmodule

 Contextmodule

 ExpressionLanguagemodule

 JDBCmodule

 ORMmodule

 OXMmodule

 JavaMessagingService(JMS)module

 Transactionmodule

 Webmodule

 Web-Servletmodule

更多关注 Java 大后端公众号 Web-Strutsmodule

 Web-Portletmodule

**4.核心容器（应用上下文)模块。** 

这是基本的 Spring 模块，提供 spring 框架的基础功能，BeanFactory 是任何以 spring 为

基础的应用的核心。Spring 框架建立在此模块之上，它使 Spring 成为一个容器。

**5.BeanFactory–BeanFactory 实现举例。** 

Bean 工厂是工厂模式的一个实现，提供了控制反转功能，用来把应用的配置和依赖从正真

的应用代码中分离。

最常用的 BeanFactory 实现是 XmlBeanFactory 类。

**6.XMLBeanFactory** 

最常用的就是 org.springframework.beans.factory.xml.XmlBeanFactory，它根据 XML 文

件中的定义加载 beans。该容器从 XML 文件读取配置元数据并用它去创建一个完全配置的系

统或应用。

**7.解释 AOP 模块** 

AOP 模块用于发给我们的 Spring 应用做面向切面的开发，很多支持由 AOP 联盟提供，这样

就确保了 Spring 和其他 AOP 框架的共通性。这个模块将元数据编程引入 Spring。

**8.解释 JDBC 抽象和 DAO 模块。** 

通过使用 JDBC 抽象和 DAO 模块，保证数据库代码的简洁，并能避免数据库资源错误关闭导

致的问题，它在各种不同的数据库的错误信息之上，提供了一个统一的异常访问层。它还利

用 Spring 的 AOP 模块给 Spring 应用中的对象提供事务管理服务。

**9.解释对象/关系映射集成模块。** 

Spring 通过提供 ORM 模块，支持我们在直接 JDBC 之上使用一个对象/关系映射映射(ORM)工

具，Spring 支持集成主流的 ORM 框架，如 Hiberate,JDO 和 iBATISSQLMaps。Spring 的事务

管理同样支持以上所有 ORM 框架及 JDBC。

**10.解释 WEB 模块。** 

Spring 的 WEB 模块是构建在 applicationcontext 模块基础之上，提供一个适合 web 应用的

上下文。这个模块也包括支持多种面向 web 的任务，如透明地处理多个文件上传请求和程序

级请求参数的绑定到你的业务对象。它也有对 JakartaStruts 的支持。

**11.为什么说 Spring 是一个容器？** 

因为用来形容它用来存储单例的 bean 对象这个特性。

**12.Spring 配置文件** 

Spring 配置文件是个 XML 文件，这个文件包含了类信息，描述了如何配置它们，以及如何

相互调用。

**13.什么是 SpringIOC 容器？** 

更多关注 Java 大后端公众号SpringIOC 负责创建对象，管理对象（通过依赖注入（DI），装配对象，配置对象，并且管

理这些对象的整个生命周期。

**14.IOC 的优点是什么？** 

IOC 或依赖注入把应用的代码量降到最低。它使应用容易测试，单元测试不再需要单例和

JNDI 查找机制。最小的代价和最小的侵入性使松散耦合得以实现。IOC 容器支持加载服务时

的饿汉式初始化和懒加载。

**15.ApplicationContext 通常的实现是什么?** 

 **FileSystemXmlApplicationContext：**此容器从一个 XML 文件中加载 beans 的定义，

XMLBean 配置文件的全路径名必须提供给它的构造函数。

 **ClassPathXmlApplicationContext：**此容器也从一个 XML 文件中加载 beans 的定义，这

里，你需要正确设置 classpath 因为这个容器将在 classpath 里找 bean 配置。

 **WebXmlApplicationContext：**此容器加载一个 XML 文件，此文件定义了一个 WEB 应用的

所有 bean。

**16.Bean 工厂和 Applicationcontexts 有什么区别？** 

Applicationcontexts 提供一种方法处理文本消息，一个通常的做法是加载文件资源（比如

镜像），它们可以向注册为监听器的 bean 发布事件。另外，在容器或容器内的对象上执行

的那些不得不由 bean 工厂以程序化方式处理的操作，可以在 Applicationcontexts 中以声

明的方式处理。Applicationcontexts 实现了 MessageSource 接口，该接口的实现以可插拔

的方式提供获取本地化消息的方法。

**17.一个 Spring 的应用看起来象什么？** 

 一个定义了一些功能的接口。

 这实现包括属性，它的 Setter，getter 方法和函数等。

 SpringAOP。 

 Spring 的 XML 配置文件。

 使用以上功能的客户端程序。

**依赖注入** 

**18.什么是 Spring 的依赖注入？** 

依赖注入，是 IOC 的一个方面，是个通常的概念，它有多种解释。这概念是说你不用创建对

象，而只需要描述它如何被创建。你不在代码里直接组装你的组件和服务，但是要在配置文

件里描述哪些组件需要哪些服务，之后一个容器（IOC 容器）负责把他们组装起来。

**19.有哪些不同类型的 IOC（依赖注入）方式？** 

更多关注 Java 大后端公众号 **构造器依赖注入：**构造器依赖注入通过容器触发一个类的构造器来实现的，该类有一系

列参数，每个参数代表一个对其他类的依赖。

 **Setter 方法注入：**Setter 方法注入是容器通过调用无参构造器或无参 static 工厂方法

实例化 bean 之后，调用该 bean 的 setter 方法，即实现了基于 setter 的依赖注入。

**20.哪种依赖注入方式你建议使用，构造器注入，还是 Setter 方法注入？** 

你两种依赖方式都可以使用，构造器注入和 Setter 方法注入。最好的解决方案是用构造器

参数实现强制依赖，setter 方法实现可选依赖。

**SpringBeans** 

**21.什么是 Springbeans?** 

Springbeans 是那些形成 Spring 应用的主干的 java 对象。它们被 SpringIOC 容器初始化，

装配，和管理。这些 beans 通过容器中配置的元数据创建。比如，以 XML 文件中<bean/>的

形式定义。

Spring 框架定义的 beans 都是单件 beans。在 beantag 中有个属性”singleton”，如果它

被赋为 TRUE，bean 就是单件，否则就是一个 prototypebean。默认是 TRUE，所以所有在 Spring

框架中的 beans 缺省都是单件。

**22.一个 SpringBean 定义包含什么？** 

一个 SpringBean 的定义包含容器必知的所有配置元数据，包括如何创建一个 bean，它的生

命周期详情及它的依赖。

**23.如何给 Spring 容器提供配置元数据?** 

这里有三种重要的方法给 Spring 容器提供配置元数据。

XML 配置文件。

基于注解的配置。

基于 java 的配置。

**24.你怎样定义类的作用域?** 

当定义一个<bean>在 Spring 里，我们还能给这个 bean 声明一个作用域。它可以通过 bean

定义中的 scope 属性来定义。如，当 Spring 要在需要的时候每次生产一个新的 bean 实例，

bean 的 scope 属性被指定为 prototype。另一方面，一个 bean 每次使用的时候必须返回同

一个实例，这个 bean 的 scope 属性必须设为 singleton。

**25.解释 Spring 支持的几种 bean 的作用域。** 

Spring 框架支持以下五种 bean 的作用域：

 **singleton:**bean 在每个 Springioc 容器中只有一个实例。

 **prototype**：一个 bean 的定义可以有多个实例。

更多关注 Java 大后端公众号 **request**：每次 http 请求都会创建一个 bean，该作用域仅在基于 web 的

SpringApplicationContext 情形下有效。

 **session**：在一个 HTTPSession 中，一个 bean 定义对应一个实例。该作用域仅在基于 web

的 SpringApplicationContext 情形下有效。

 **global-session**：在一个全局的 HTTPSession 中，一个 bean 定义对应一个实例。该作用

域仅在基于 web 的 SpringApplicationContext 情形下有效。

缺省的 Springbean 的作用域是 Singleton.

**26.Spring 框架中的单例 bean 是线程安全的吗?** 

不，Spring 框架中的单例 bean 不是线程安全的。

**27.解释 Spring 框架中 bean 的生命周期。** 

 Spring 容器从 XML 文件中读取 bean 的定义，并实例化 bean。 

 Spring 根据 bean 的定义填充所有的属性。

 如果 bean 实现了 BeanNameAware 接口，Spring 传递 bean 的 ID 到 setBeanName 方法。

 如果 Bean 实现了 BeanFactoryAware 接口，Spring 传递 beanfactory 给 setBeanFactory

方法。

 如果有任何与 bean 相关联的 BeanPostProcessors，Spring 会在

postProcesserBeforeInitialization()方法内调用它们。

 如果 bean 实现 IntializingBean 了，调用它的 afterPropertySet 方法，如果 bean 声明

了初始化方法，调用此初始化方法。

 如果有 BeanPostProcessors 和 bean 关联，这些 bean 的

postProcessAfterInitialization()方法将被调用。

 如果 bean 实现了 DisposableBean，它将调用 destroy()方法。

**28.哪些是重要的 bean 生命周期方法？你能重载它们吗？** 

有两个重要的 bean 生命周期方法，第一个是 setup，它是在容器加载 bean 的时候被调用。

第二个方法是 teardown 它是在容器卸载类的时候被调用。

Thebean 标签有两个重要的属性（init-method 和 destroy-method）。用它们你可以自己定

制初始化和注销方法。它们也有相应的注解（@PostConstruct 和@PreDestroy）。

**29.什么是 Spring 的内部 bean？** 

当一个 bean 仅被用作另一个 bean 的属性时，它能被声明为一个内部 bean，为了定义

innerbean，在Spring的基于XML的配置元数据中，可以在<property/>或<constructor-arg/>

元素内使用<bean/>元素，内部 bean 通常是匿名的，它们的 Scope 一般是 prototype。

**30.在 Spring 中如何注入一个 java 集合？** 

Spring 提供以下几种集合的配置元素：

更多关注 Java 大后端公众号 <list>类型用于注入一列值，允许有相同的值。

 <set>类型用于注入一组值，不允许有相同的值。

 <map>类型用于注入一组键值对，键和值都可以为任意类型。

 <props>类型用于注入一组键值对，键和值都只能为 String 类型。

**31.什么是 bean 装配?** 

装配，或 bean 装配是指在 Spring 容器中把 bean 组装到一起，前提是容器需要知道 bean

的依赖关系，如何通过依赖注入来把它们装配到一起。

**32.什么是 bean 的自动装配？** 

Spring 容器能够自动装配相互合作的 bean，这意味着容器不需要<constructor-arg>和

<property>配置，能通过 Bean 工厂自动处理 bean 之间的协作。

**33.解释不同方式的自动装配。** 

有五种自动装配的方式，可以用来指导 Spring 容器用自动装配方式来进行依赖注入。

 **no**：默认的方式是不进行自动装配，通过显式设置 ref 属性来进行装配。

 **byName：**通过参数名自动装配，Spring 容器在配置文件中发现 bean 的 autowire 属性被

设置成 byname，之后容器试图匹配、装配和该 bean 的属性具有相同名字的 bean。 

 **byType:：**通过参数类型自动装配，Spring 容器在配置文件中发现 bean 的 autowire 属

性被设置成 byType，之后容器试图匹配、装配和该 bean 的属性具有相同类型的 bean。

如果有多个 bean 符合条件，则抛出错误。

 **constructor：这个方式类似于** byType，但是要提供给构造器参数，如果没有确定的带

参数的构造器参数类型，将会抛出异常。

 **autodetect：**首先尝试使用 constructor 来自动装配，如果无法工作，则使用 byType 方

式。

**34.自动装配有哪些局限性?** 

自动装配的局限性是：

 **重写**：你仍需用<constructor-arg>和<property>配置来定义依赖，意味着总要重写自动

装配。

 **基本数据类型**：你不能自动装配简单的属性，如基本数据类型，String 字符串，和类。

 **模糊特性：**自动装配不如显式装配精确，如果有可能，建议使用显式装配。

**35.你可以在 Spring 中注入一个 null 和一个空字符串吗？** 

**可以。**

**Spring 注解** 

**36.什么是基于 Java 的 Spring 注解配置?给一些注解的例子.** 

更多关注 Java 大后端公众号更多关注 Java 大后端公众号

基于 Java 的配置，允许你在少量的 Java 注解的帮助下，进行你的大部分 Spring 配置而非

通过 XML 文件。

以@Configuration 注解为例，它用来标记类可以当做一个 bean 的定义，被 SpringIOC 容器

使用。另一个例子是@Bean 注解，它表示此方法将要返回一个对象，作为一个 bean 注册进

Spring 应用上下文。

**37.什么是基于注解的容器配置?** 

相对于 XML 文件，注解型的配置依赖于通过字节码元数据装配组件，而非尖括号的声明。

开发者通过在相应的类，方法或属性上使用注解的方式，直接组件类中进行配置，而不是使

用 xml 表述 bean 的装配关系。

**38.怎样开启注解装配？** 

注解装配在默认情况下是不开启的，为了使用注解装配，我们必须在 Spring 配置文件中配

置<context:annotation-config/>元素。

**39.@Required 注解** 

这个注解表明 bean 的属性必须在配置的时候设置，通过一个 bean 定义的显式的属性值或通

过自动装配，若@Required 注解的 bean 属性未被设置，容器将抛出

BeanInitializationException。

**40.@Autowired 注解** 

@Autowired 注解提供了更细粒度的控制，包括在何处以及如何完成自动装配。它的用法和

@Required 一样，修饰 setter 方法、构造器、属性或者具有任意名称和/或多个参数的 PN

方法。

**41.@Qualifier 注解** 

当有多个相同类型的 bean 却只有一个需要自动装配时，将@Qualifier 注解和@Autowire 注

解结合使用以消除这种混淆，指定需要装配的确切的 bean。

**Spring 数据访问** 

**42.在 Spring 框架中如何更有效地使用 JDBC?** 

使用 SpringJDBC 框架，资源管理和错误处理的代价都会被减轻。所以开发者只需写

statements 和 queries 从数据存取数据，JDBC 也可以在 Spring 框架提供的模板类的帮助下

更有效地被使用，这个模板叫 JdbcTemplate（例子见这里 here）

**43.JdbcTemplate** 

JdbcTemplate 类提供了很多便利的方法解决诸如把数据库数据转变成基本数据类型或对象，

执行写好的或可调用的数据库操作语句，提供自定义的数据错误处理。

**44.Spring 对 DAO 的支持** 

Spring 对数据访问对象（DAO）的支持旨在简化它和数据访问技术如 JDBC，HibernateorJDO

结合使用。这使我们可以方便切换持久层。编码时也不用担心会捕获每种技术特有的异常。更多关注 Java 大后端公众号

**45.使用 Spring 通过什么方式访问 Hibernate?** 

在 Spring 中有两种方式访问 Hibernate： 

 控制反转 HibernateTemplate 和 Callback。 

 继承 HibernateDAOSupport 提供一个 AOP 拦截器。

**46.Spring 支持的 ORM** 

Spring 支持以下 ORM： 

 Hibernate

 iBatis

 JPA(JavaPersistenceAPI)

 TopLink

 JDO(JavaDataObjects)

 OJB

**47.如何通过 HibernateDaoSupport 将 Spring 和 Hibernate 结合起来？** 

用 Spring 的 SessionFactory 调用 LocalSessionFactory。集成过程分三步：

 配置 theHibernateSessionFactory。 

 继承 HibernateDaoSupport 实现一个 DAO。 

 在 AOP 支持的事务中装配。

**48.Spring 支持的事务管理类型** 

Spring 支持两种类型的事务管理：

 **编程式事务管理**：这意味你通过编程的方式管理事务，给你带来极大的灵活性，但是难

维护。

 **声明式事务管理：**这意味着你可以将业务代码和事务管理分离，你只需用注解和 XML 配

置来管理事务。

**49.Spring 框架的事务管理有哪些优点？** 

 它为不同的事务 API 如 JTA，JDBC，Hibernate，JPA 和 JDO，提供一个不变的编程模式。

 它为编程式事务管理提供了一套简单的 API 而不是一些复杂的事务 API 如 

 它支持声明式事务管理。

 它和 Spring 各种数据访问抽象层很好得集成。

**50.你更倾向用那种事务管理类型？** 更多关注 Java 大后端公众号

大多数 Spring 框架的用户选择声明式事务管理，因为它对应用代码的影响最小，因此更符

合一个无侵入的轻量级容器的思想。声明式事务管理要优于编程式事务管理，虽然比编程式

事务管理（这种方式允许你通过代码控制事务）少了一点灵活性。

**Spring 面向切面编程（AOP）** 

**51.解释 AOP** 

面向切面的编程，或 AOP，是一种编程技术，允许程序模块化横向切割关注点，或横切典型

的责任划分，如日志和事务管理。

**52.Aspect 切面** 

AOP 核心就是切面，它将多个类的通用行为封装成可重用的模块，该模块含有一组 API 提供

横切功能。比如，一个日志模块可以被称作日志的 AOP 切面。根据需求的不同，一个应用程

序可以有若干切面。在 SpringAOP 中，切面通过带有@Aspect 注解的类实现。

**52.在 SpringAOP 中，关注点和横切关注的区别是什么？** 

关注点是应用中一个模块的行为，一个关注点可能会被定义成一个我们想实现的一个功能。

横切关注点是一个关注点，此关注点是整个应用都会使用的功能，并影响整个应用，比如日

志，安全和数据传输，几乎应用的每个模块都需要的功能。因此这些都属于横切关注点。

**54.连接点** 

连接点代表一个应用程序的某个位置，在这个位置我们可以插入一个 AOP 切面，它实际上是

个应用程序执行 SpringAOP 的位置。

**55.通知** 

通知是个在方法执行前或执行后要做的动作，实际上是程序执行时要通过 SpringAOP 框架触

发的代码段。

Spring 切面可以应用五种类型的通知：

 **before**：前置通知，在一个方法执行前被调用。

 **after:**在方法执行之后调用的通知，无论方法执行是否成功。

 **after-returning:**仅当方法成功完成后执行的通知。

 **after-throwing:**在方法抛出异常退出时执行的通知。

 **around:**在方法执行之前和之后调用的通知。

**56.切点** 

切入点是一个或一组连接点，通知将在这些位置执行。可以通过表达式或匹配的方式指明切

入点。

**57.什么是引入?** 

引入允许我们在已存在的类中增加新的方法和属性。

**58.什么是目标对象?** 更多关注 Java 大后端公众号

被一个或者多个切面所通知的对象。它通常是一个代理对象。也指被通知（advised）对象。

**59.什么是代理?** 

代理是通知目标对象后创建的对象。从客户端的角度看，代理对象和目标对象是一样的。

**60.有几种不同类型的自动代理？** 

BeanNameAutoProxyCreator

DefaultAdvisorAutoProxyCreator

Metadataautoproxying

**61.什么是织入。什么是织入应用的不同点？** 

织入是将切面和到其他应用类型或对象连接或创建一个被通知对象的过程。

织入可以在编译时，加载时，或运行时完成。

**62.解释基于 XMLSchema 方式的切面实现。** 

在这种情况下，切面由常规类以及基于 XML 的配置实现。

**63.解释基于注解的切面实现** 

在这种情况下(基于@AspectJ 的实现)，涉及到的切面声明的风格与带有 java5 标注的普通

java 类一致。

**Spring 的 MVC** 

**64.什么是 Spring 的 MVC 框架？** 

Spring 配备构建 Web 应用的全功能 MVC 框架。Spring 可以很便捷地和其他 MVC 框架集成，

如 Struts，Spring 的 MVC 框架用控制反转把业务对象和控制逻辑清晰地隔离。它也允许以

声明的方式把请求参数和业务对象绑定。

**65.DispatcherServlet** 

Spring 的 MVC 框架是围绕 DispatcherServlet 来设计的，它用来处理所有的 HTTP 请求和响

应。

**66.WebApplicationContext** 

WebApplicationContext 继承了 ApplicationContext 并增加了一些 WEB 应用必备的特有功

能，它不同于一般的 ApplicationContext，因为它能处理主题，并找到被关联的 servlet。

**67.什么是 SpringMVC 框架的控制器？** 

控制器提供一个访问应用程序的行为，此行为通常通过服务接口实现。控制器解析用户输入

并将其转换为一个由视图呈现给用户的模型。Spring 用一个非常抽象的方式实现了一个控

制层，允许用户创建多种用途的控制器。

**68.@Controller 注解** 

该注解表明该类扮演控制器的角色，Spring 不需要你继承任何其他控制器基类或引用

ServletAPI。**69.@RequestMapping 注解** 

该注解是用来映射一个 URL 到一个类或一个特定的方处理法上。

**70.返回 Json 用什么注解？** 

@ResponseBody





