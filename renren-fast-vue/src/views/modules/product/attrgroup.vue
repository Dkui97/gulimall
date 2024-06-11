<template>
  <el-row :gutter="20">
    <el-col :span="6">
      <category ></category>
    </el-col>
    <el-col :span="18">
      详情
    </el-col>
  </el-row>
</template>

<script>
/**
 * 父子组件传递数据
 * 1)、子组件给父组件传递数据，事件机制；
 *    子组件给父组件发送一个事件，携带上数据。
 * // this.$emit("事件名",携带的数据...)
 */
//这里可以导入其他文件（比如：组件，工具js，第三方插件js，json文件，图片文件等等）
//例如：import《组件名称》from'《组件路径》';
import Category from "../../common/cateory";
export default {
  //import引入的组件需要注入到对象中才能使用
  components: { Category},
  props: {},
  data() {
    return {

    };
  },
  activated() {
  },
  methods: {

  }
};
</script>
<style scoped>
</style>
