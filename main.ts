main.ts     import { ApplicationConfig } from '@angular/core';
import { provideHttpClient, withInterceptorsFromDi } from '@angular/common/http';  // <-- Import necessary HttpClient modules
import { bootstrapApplication } from '@angular/platform-browser';
import { AppComponent } from './app/app.component';

export const appConfig: ApplicationConfig = {
  providers: [
    provideHttpClient(withInterceptorsFromDi())  // <-- Provide HttpClientModule here
  ]
};

bootstrapApplication(AppComponent, appConfig)
  .catch((err) => console.error(err));
