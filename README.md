# FuckDomainMini



## **简介：**

这是一款基于java开发Windows的内网信息收集、利用工具

可以节省您的信息收集所花费的，又或者是做免杀所花费的时间

现在这个版本是先行版本，目前先行版只有一个功能，更多的功能还在调试与开发中。

尽情期待！

## **功能介绍：**

通过调用windows官方软件进行信息收集与利用，做到完全免杀

**PS：**目前现行版本>Mini<只能进行域横向渗透时的爆破作用

## **使用方法：**

* 将在域中收集到的IP地址或者计算机名（网络名）放入到：

  ```
  C:\FuckDomainMini\Dictionary\TARGET.txt
  ```

* 将在域中收集到的用户名放入到：

  ```
  C:\FuckDomainMini\Dictionary\USER.txt
  ```

* 将在域中收集到的密码放入到：

  ```
  C:\FuckDomainMini\Dictionary\PASSWD.txt
  ```

* 将在域中收集到的域用户组名放入到：

  ```
  C:\FuckDomainMini\Dictionary\GROUP.txt
  ```

  *ps：*GROUP.txt中最好不要为空，不然可能爆破失败

  如要爆破本地用户组，可以采用写入 workgroup 或者两行空格

  ![图片1](https://user-images.githubusercontent.com/109142312/223676947-395b60cd-2cb4-4e9f-81e8-eeddf28eac9e.png)


* 运行FuckDomainMini.exe，会自动在C:\FuckDomainMini\Dictionary\中生成的RESULT.txt中写入爆破成功的IP/网络名，用户名和密码

**PS：**1、必须将文件夹放到C盘中	2、根据放入的数据多少会导致结果产生较慢，请耐心等待

<br>

***目前现行版本的工具功能还未完善，缺点较多，请留下您宝贵的意见，我会加以采纳改进！***
