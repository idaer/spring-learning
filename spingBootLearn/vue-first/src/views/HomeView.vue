<template>
<!--Home-->
<!--  <el-button type="primary" >Home按钮</el-button>-->
<!--  <button>test</button>-->
  <div>
    <el-table :data="tableData" style="width: max-content;" stripe="altrue">
      <el-table-column prop="date" label="日期" min-width="180" />
      <el-table-column prop="name" label="姓名" min-width="180" />
      <el-table-column prop="address" label="地址" min-width="300" />
    </el-table>
  </div>
</template>

<script>
import axios from "axios";

let altrue=true;

export default {
  name:"HomeView",
  //组件导入
  components:{
    axios
  },
  data() {
    return{
      username:"",
      msg:"",
      user:{
        name:"",
        age:"",
        gender:"",
        email:""
      },
      tableData:[
        {
            name:"傻逼",
            date:'2020-5-6',
            address:"李家村250号"
        },
        {
          name:"傻逼",
          date:'2020-5-6',
          address:"李家村250号"
        },
        {
          name:"傻逼",
          date:'2020-5-6',
          address:"李家村250号"
        },]
    }
  },
  methods:{
    getValue1() {
      let that=this;
      let url="http://localhost:8090/hello/one?name="+that.username;

      axios.get(url).then(retObj=>{
        if (retObj.status===200) {
          that.msg=retObj.data
        }
        else {
          alert('加载错误')
        }
      }).catch(function (error) {
        console.log(error)
      })
    },
    getValue2() {
      let that=this;
      let url="http://localhost:8090/hello/three?name="+that.username;

      axios.get(url).then(retObj=>{
        if (retObj.status===200) {
          that.msg=retObj.data
        }
        else {
          alert('加载错误')
        }
      }).catch(function (error) {
        console.log(error)
      })
    },
    postValue() {
      let url="http://localhost:8090/hello/two";

      axios.post(url,{
        name:this.user.name,
        age:this.user.age,
        gender:this.user.gender,
        email:this.user.email

      }).then(response=>{
        console.log(response)
        this.msg=response.data;
      })
    }
  }

}
</script>
<style>
* {
  flex-shrink:0;
}
</style>