# BottomNavigationBar
update
新增MODE_FIXED_EX mode模式
 * 无放大缩小动画  可以修改 图片大小 文字大小  图片文字间隔  图片距离顶部高度  文字距离底部高度
 * 见FixedExBottomNavigationTab   感谢开源作者 "https://github.com/Ashok-Varma/BottomNavigation"  
  
    查看 BottomNavigationBar fixed_ex dimen文件 看见修改属性
  ```java
        "fixed_ex_icon_grid">20dp  ---fixe ex icon_grid 大小 -->
        "fixed_ex_label_active">12sp  ---fixe ex  textview 选中文字大小 -->
        "fixed_ex_label_inactive">12sp  ---fixe ex  textview 未选中文字大小 -->
        "fixed_ex_height_bottom_padding">6dp   ---fixe ex  textview 距离底部dp -->
        "fixed_ex_height_top_padding_inactive">3dp  ---fixe ex  icon 放大多少 未选择 -->
        "fixed_ex_height_top_padding_active">3dp ---fixe ex  icon 放大多少 选择 -->
        "fixed_ex_text_margin_top">1dp ---fixe ex 文字与  icon 距离  -->
  ```
 
