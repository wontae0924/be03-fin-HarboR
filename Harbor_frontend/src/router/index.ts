import { createRouter, createWebHistory } from 'vue-router';
import MainRoutes from './MainRoutes';
import AuthRoutes from './AuthRoutes';
import { useAuthStore } from '@/stores/auth';

export const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/:pathMatch(.*)*',
      component: () => import('@/views/pages/maintenance/error/Error404Page.vue')
    },
    MainRoutes,
    AuthRoutes
  ]
});

interface User {
  // Define the properties and their types for the user data here
  // For example:
  id: number;
  name: string;
}

// Assuming you have a type/interface for your authentication store
interface AuthStore {
  user: User | null;
  returnUrl: string | null;
  login(email: string | undefined, employeeId: string | undefined, password: string): Promise<void>;
  logout(): void;
}

router.beforeEach(async (to, from, next) => {
  // redirect to login page if not logged in and trying to access a restricted page
  const publicPages = ['/auth/login3'];
  const authRequired = !publicPages.includes(to.path);
  const auth: AuthStore = useAuthStore();
  const token = localStorage.getItem('token');
  if (to.matched.some((record) => record.meta.requiresAuth)) {
    if (authRequired && !token) {
      auth.returnUrl = to.fullPath;
      return next('/auth/login3');
    } else next();
  } else {
    next();
  }
});
