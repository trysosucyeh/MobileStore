app.component.ts             import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MobileService } from './mobile.service';
import { Mobile } from './mobile';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Mobile Store';
  mobiles: Mobile[] = [];
  cart: Mobile[] = [];

  constructor(private mobileService: MobileService) {}

  ngOnInit(): void {
    this.mobileService.getMobiles().subscribe(data => {
      // Remove duplicates by using a Set or Map based on 'model' to ensure unique items
      this.mobiles = [...new Map(data.map(item => [item.model, item])).values()];
  
      // Optional: You can add an image URL here if not present in the backend
      this.mobiles = this.mobiles.map(item => {
        let imageUrl: string;
  
        switch(item.model) {
          case 'GalaxyS23':
            imageUrl = 'assets/images/galaxy-s23.jpeg';
            break;
          case 'iPhone14':
            imageUrl = 'assets/images/iphone14.jpg';
            break;
          case 'Nord3':
            imageUrl = 'assets/images/nord3.jpeg';
            break;
          case 'Pixel7':
            imageUrl = 'assets/images/pixel7.jpeg';
            break;
          default:
            imageUrl = 'assets/images/default.jpeg';  // Default image in case no match
            break;
        }
        return { ...item, imageUrl };
      });
    });
  }


  addToCart(mobile: Mobile): void {
    if (!this.cart.find(item => item.model === mobile.model)) {
      this.cart.push(mobile);
    }
  }

  removeFromCart(model: string): void {
    this.cart = this.cart.filter(item => item.model !== model);
  }

  buyNow(model: string): void {
    alert(`Buying: ${model}`);
  }

  isInCart(mobile: Mobile): boolean {
    return this.cart.some(item => item.model === mobile.model);
  }
                }
