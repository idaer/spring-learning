<template>
  <nav>
    <Header/>
    <div style="display: flex;width:max-content;">
      <Aside/>
      <router-view/>
    </div>
  </nav>

</template>

<script>
import Header from "@/components/Header";
import Aside from "@/components/Aside";

export default {
  name:"layout",
  components:{
    Aside,
    Header
  }
}
</script>
