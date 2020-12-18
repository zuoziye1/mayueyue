# mayueyue

<font color=#999AAA >提示：
学些demo使用
</font>

<hr style=" border:solid; width:100px; height:1px;" color=#000000 size=1">

# .gitignore 

## 1.语法
[语法](https://blog.csdn.net/le_17_4_6/article/details/92789993)


## 2.使.gitignore文件生效
```
    #清除缓存
    git rm -r --cached .  

    #重新trace file
    git add . 

    #提交和注释
    git commit -m "update .gitignore" 

    #可选，如果需要同步到remote上的话
    git push origin master 
```

## 3.插件安装
idea可以安装.gitignore插件，自动生成一些忽略规则