
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"
import PayManager from "./components/listers/PayCards"
import PayDetail from "./components/listers/PayDetail"

import ShopManager from "./components/listers/ShopCards"
import ShopDetail from "./components/listers/ShopDetail"

import DeliveryManager from "./components/listers/DeliveryCards"
import DeliveryDetail from "./components/listers/DeliveryDetail"

import LogManager from "./components/listers/LogCards"
import LogDetail from "./components/listers/LogDetail"

import MyNotifyView from "./components/MyNotifyView"
import MyNotifyViewDetail from "./components/MyNotifyViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },
            {
                path: '/pays',
                name: 'PayManager',
                component: PayManager
            },
            {
                path: '/pays/:id',
                name: 'PayDetail',
                component: PayDetail
            },

            {
                path: '/shops',
                name: 'ShopManager',
                component: ShopManager
            },
            {
                path: '/shops/:id',
                name: 'ShopDetail',
                component: ShopDetail
            },

            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryDetail',
                component: DeliveryDetail
            },

            {
                path: '/logs',
                name: 'LogManager',
                component: LogManager
            },
            {
                path: '/logs/:id',
                name: 'LogDetail',
                component: LogDetail
            },

            {
                path: '/myNotifies',
                name: 'MyNotifyView',
                component: MyNotifyView
            },
            {
                path: '/myNotifies/:id',
                name: 'MyNotifyViewDetail',
                component: MyNotifyViewDetail
            },


    ]
})
