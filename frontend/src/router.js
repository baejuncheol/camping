
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);



import MyPageView from "./components/MyPageView"
import MyPageViewDetail from "./components/MyPageViewDetail"
import MileageManager from "./components/listers/MileageCards"
import MileageDetail from "./components/listers/MileageDetail"

import CampsiteManager from "./components/listers/CampsiteCards"
import CampsiteDetail from "./components/listers/CampsiteDetail"

import ReservationManager from "./components/listers/ReservationCards"
import ReservationDetail from "./components/listers/ReservationDetail"

import PaymentManager from "./components/listers/PaymentCards"
import PaymentDetail from "./components/listers/PaymentDetail"

import ReviewManager from "./components/listers/ReviewCards"
import ReviewDetail from "./components/listers/ReviewDetail"

import MessageManager from "./components/listers/MessageCards"
import MessageDetail from "./components/listers/MessageDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [

            {
                path: '/myPages',
                name: 'MyPageView',
                component: MyPageView
            },
            {
                path: '/myPages/:id',
                name: 'MyPageViewDetail',
                component: MyPageViewDetail
            },
            {
                path: '/mileages',
                name: 'MileageManager',
                component: MileageManager
            },
            {
                path: '/mileages/:id',
                name: 'MileageDetail',
                component: MileageDetail
            },

            {
                path: '/campsites',
                name: 'CampsiteManager',
                component: CampsiteManager
            },
            {
                path: '/campsites/:id',
                name: 'CampsiteDetail',
                component: CampsiteDetail
            },

            {
                path: '/reservations',
                name: 'ReservationManager',
                component: ReservationManager
            },
            {
                path: '/reservations/:id',
                name: 'ReservationDetail',
                component: ReservationDetail
            },

            {
                path: '/payments',
                name: 'PaymentManager',
                component: PaymentManager
            },
            {
                path: '/payments/:id',
                name: 'PaymentDetail',
                component: PaymentDetail
            },

            {
                path: '/reviews',
                name: 'ReviewManager',
                component: ReviewManager
            },
            {
                path: '/reviews/:id',
                name: 'ReviewDetail',
                component: ReviewDetail
            },

            {
                path: '/messages',
                name: 'MessageManager',
                component: MessageManager
            },
            {
                path: '/messages/:id',
                name: 'MessageDetail',
                component: MessageDetail
            },



    ]
})
