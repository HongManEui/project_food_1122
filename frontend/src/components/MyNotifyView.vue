<template>

    <v-data-table
        :headers="headers"
        :items="myNotify"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'MyNotifyView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "status", value: "status" },
            ],
            myNotify : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/myNotifies'))

            temp.data._embedded.myNotifies.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.myNotify = temp.data._embedded.myNotifies;
        },
        methods: {
        }
    }
</script>

