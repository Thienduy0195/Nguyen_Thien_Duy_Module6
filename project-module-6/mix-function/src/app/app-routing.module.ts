import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ServiceRequiredComponent} from "./component/service-required/service-required.component";
import {UserDetailComponent} from "./component/user-detail/user-detail.component";


const routes: Routes = [
  {
    path: '',
    component: UserDetailComponent
  },
  {
  path: 'order-service',
  component: ServiceRequiredComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
