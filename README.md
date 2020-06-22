- android ui适配，基于smallestWidth的适配方案


> Tips:大部分手机的宽度dp值集中在320-450之间，大部分1080P的手机应该都是360dp，390dp,411dp。可以在这个基础上，参考Android studio中的Virtual Device Configuration

![](https://github.com/ladingwu/dimens_sw/blob/master/tips.jpg)


## 使用说明
- clone该项目到本地,以Android项目打开。
- DimenTypes文件中写入你希望适配的sw尺寸，默认的这些尺寸能够覆盖几乎所有手机适配需求
- DimenGenerator文件中填写设计稿的尺寸(DESIGN_WIDTH是设计稿宽度，DESIGN_HEIGHT是设计稿高度)
- 执行lib module中的DimenGenerator.main()方法，当前地址下会生成相应的适配文件,把相应的文件连带文件夹拷贝到正在开发的项目中
- 可以在androidstudio中直接运行生成资源文件，生成后将文件复制到所需要的工程即可直接使用。
- 文件中未包含Sp生成的规则，不同生成文件间的sp比值与dp的比值是一致的，可以自行计算转换。
## 希望用真机测试的，可运行app项目看效果(效果如下图)

![](https://github.com/ladingwu/dimens_sw/blob/master/test.png)
