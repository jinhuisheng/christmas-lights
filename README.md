# christmas-lights

## 描述

>你的邻居每年都能在度假屋装饰大赛中打败你，你觉得很没面子。
>
>现在，你决定搞一个1000 x 1000的灯光网格（light grid)打败他。
>
>由于今年你表现的特别棒，圣诞老人给你发了关于如何配置灯光的说明。
>
>网格中的灯光在每个方向上的编号为0到999。
>
>每个角的坐标为(0,0),(0,999),(999,999)和(999,0)。
>
>说明中包括对给出的坐标对(coordinate pairs)范围内，进行打开(trun on)、关闭(turn off)和切换（toggle)的操作。
>
>每个坐标对表示了一个矩形的两个对角，像(0,0)到(2,2)这样的坐标对表示的是一个3x3的正方形中的9盏灯。
>
>所有的灯开始的时候是关闭的。为了将你的邻居按在地上摩擦，你需要做的就是按照圣诞老人给的说明来设置灯光。

* 对(0,0)到（999,999)做打开操作点亮所有的灯。
* 对(0,0)到（999,0)做切换操作将影响第一行的灯，关闭的灯打开 ，打开的灯关闭。
* 对(499,499)到(500,500)做关闭操作，关闭中间的4盏灯。

按照说明操作后，有多少灯是点亮的？

### 测试用例
10X10 网格

* 初始化 - 所有的灯开始的时候是关闭的。
* 对(0,0)到（9,9) 做打开操作  所有灯都是亮的
* 对(0,0)到 (9,0) 做切换操作 
* 对(4,4)到(5,5) 做关闭操作 ，关闭中间4盏灯 


## 扩展
>
>经过一阵忙活，你终于完成了。但是。。。你发现你貌似误解了圣诞老人的意思。
>
>你购买的灯光网格实际上有单独的亮度(brightness)控制。每盏灯都有0或更高的亮度值，亮度从0开始。

* 打开操作实际上是将亮度增加1
* 关闭操作实际上是将亮度减少1，最小值是0
* 切换操作实际上是将 亮度增加2
* 经过以上操作后灯光的总亮度是多少？

比如：

* 对(0,0)到(0,0)做打开操作后总亮度为1
* 对(0,0)到(999,999)做切换操作后总亮度为2000000

## 专业术语

### 名词
圣诞灯 (christmas-lights)
灯光网格（light grid)
坐标对(coordinate pairs)
灯 （light）
亮度 （brightness）

### 动词
打开(turn on)
关闭(turn off)
切换（toggle)


## kata地址
https://kata-log.rocks/christmas-lights-kata
https://ynfeng.github.io/2019/11/29/ChristmasLightsKata/    
