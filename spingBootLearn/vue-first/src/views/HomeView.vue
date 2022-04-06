<template>
  <div class="home">
    Home
    <input type="text" placeholder="请输入名字" v-model="username">
    <button @click="getValue">get</button>
    <hr/>
    {{ msg }}
  </div>
</template>

<script>
import axios from "axios";

export default {
  name:"HomeView",
  components:{
    axios
  },
  data() {
    return{
      username:"",
      msg:""
    }
  },
  methods:{
    getValue() {
      let that=this;
      let url="http://localhost:8080/hello/one?name="+that.username;

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
    }
  }

}
</script>
<style>

</style>