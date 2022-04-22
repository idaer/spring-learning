<template>
  <div class="home">
    Home
    <input type="text" placeholder="请输入名字" v-model="username">
    <button @click="getValue1">get1</button>
    <button @click="getValue2">get2</button>
    <hr/>
    <form @submit.prevent>
      姓名：<input type="text" name="name" v-model="user.name"><br/>
      年龄：<input type="text" name="age" v-model="user.age"><br/>
      性别：<input type="radio" name="gender" v-model="user.gender" value="Man">男
      <input type="radio" name="gender" v-model="user.gender" value="Woman">女<br/>
      邮箱：<input type="text" name="email" v-model="user.email"><br/>
      <input type="submit" value="提交" @click="postValue">
    </form>
    {{ msg }}
  </div>
</template>

<script>
import axios from "axios";

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
      }
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

</style>