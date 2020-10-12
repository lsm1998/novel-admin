<template>
  <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
    <el-form ref="form" :model="form" :rules="rules" label-width="80px">
      <el-form-item label="父分类" prop="pid">
        <el-select v-model="form.pid">
          <el-option
            v-for="item in typeList"
            :key="item.id"
            :label="item.name"
            :value="item.id"
          ></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="图片地址" prop="pic">
        <el-input v-model="form.pic" placeholder="请输入图片地址"/>
      </el-form-item>

      <el-form-item label="名称" prop="name">
        <el-input v-model="form.name" placeholder="请输入名称"></el-input>
      </el-form-item>
    </el-form>
    <div slot="footer" class="dialog-footer">
      <el-button type="primary" @click="submitForm">确 定</el-button>
      <el-button @click="cancel">取 消</el-button>
    </div>
  </el-dialog>
</template>

<script>
import {addType} from "@/api/book/typeApi";

export default {
  name: "Edit",
  props: {
    title: {
      type: String,
      default: "新增分类"
    },
    open: {
      type: Boolean,
      default: true
    }
  },
  data() {
    return {
      form: {},
      typeList: [],
      // 表单校验
      rules: {
        pid: [
          {required: true, message: "父分类不可以为空", trigger: "blur"}
        ],
        pic: [
          {required: true, message: "图片地址不能为空", trigger: "blur"}
        ],
        name: [
          {required: true, message: "名称不能为空", trigger: "blur"}
        ]
      }
    }
  },
  created() {
    this.getList();
  },
  methods: {
    getList() {
      this.typeList.push({id: 0, name: "无"});
    },
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          addType(this.form).then(
            response => {
              this.$message("新增完成");
              this.cancel();
            }
          );
        }
      });
    },
    reset() {
      this.form = {}
    },
    cancel() {
      this.reset();
      this.$emit("close");
    },
  }
}
</script>

<style scoped>

</style>
