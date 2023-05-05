// Component.js
import { LightningElement, api } from 'lwc';

export default class ConfigureOneDrive extends LightningElement {
    @api loginUrl;
    @api username;
    @api password;
    @api url;
    @api repositoryName;
    @api showEntries;
    @api title;
    @api userName;
    @api action;
    @api pageNumber;
    
    //Navigate to sacral.ai website and login
    navigateToSacralAiWebsite(){
        window.location = this.loginUrl;
    }
    
    //Login to the sacral.ai website
    loginToSacralAiWebsite(){
        //Code to login to sacral.ai website
    }
    
    //Access "Expert Services to change Business" page
    accessExpertServicesPage(){
        //Code to access "Expert Services to change Business" page
    }
    
    //Click on Configure 
    clickOnConfigure(){
        //Code to click on configure
    }
    
    //Click on ONEDRIVE
    clickOnOneDrive(){
        //Code to click on ONEDRIVE
    }
    
    //Pop up form for entering details
    popUpForm(){
        //Code to display pop up form
    }
    
    //Enter username, password, url and repository name 
    enterDetails(){
        this.username = '';
        this.password = '';
        this.url = '';
        this.repositoryName = '';
    }
    
    //Reset button to enter details again
    resetForm(){
        this.username = '';
        this.password = '';
        this.url = '';
        this.repositoryName = '';
    }
    
    //Save button to configure
    save(){
        //Code to save configuration
    }
    
    //Validate credentials using Java API
    validateCredentials(){
        //Code to validate credentials using Java API
    }
    
    //Display list with Title, User Name, URL and Action
    displayList(){
        //Code to display list
    }
    
    //Edit button to make changes to the Title, User Name and URL
    edit(){
        //Code to edit the list
    }
    
    //Delete button to delete a particular title from the list
    delete(){
        //Code to delete the title from the list
    }
    
    //Change the number of entries to display 
    changeNoOfEntries(){
        this.showEntries = '';
    }
    
    //Display pagination
    displayPagination(){
        //Code to display pagination 
    }
    
    //Change page numbers 
    changePageNumber(){
        this.pageNumber = '';
    }
    
    //Add more button to configure other ONEDRIVE
    addMore(){
        //Code to add more
    }
}