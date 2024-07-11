

const mongoose = require('mongoose');

const mongoURI = "mongodb+srv://anigbojohnsona:Sonship123@cluster0.kybkuyh.mongodb.net/FTMP?retryWrites=true&w=majority";
let db = undefined;

async function connect() {
    try {
      mongoose.connect(mongoURI, {
        useNewUrlParser: true,
        useUnifiedTopology: true,
        serverSelectionTimeoutMS: 30000
    })
    .then(() => {
        console.log("Connected successfully to MongoDB");
    })
    .catch(error => {
        console.error("Error connecting to MongoDB:", error);
    });
    } catch (error) {
        console.error(error);
    }
}
        
           const userSchema = new mongoose.Schema({
        
            id: {
        
                type: Number,
        
                unique: true,
            
            },
        
            username: {
        
                type: String,
        
                required: true,
            
                unique: true,
            
            },
        
               }, {
                    timestamps: true,
                 });
               
           const orderSchema = new mongoose.Schema({
        
            id: {
        
                type: Number,
        
                required: true,
            
                unique: true,
            
            },
        
            price: {
        
                type: String,
        
                required: true,
            
                unique: true,
            
            },
        
            userOrder: {
        
                type: mongoose.Schema.Types.ObjectId,
                ref: 'User',
        
            },
        
               }, {
                    timestamps: true,
                 });
               
               (async () => {
                             try{
                               await connect()
				const User = mongoose.model("User",userSchema);
			
				const Order = mongoose.model("Order",orderSchema);
			
               const refValue0 = new User({'id': 1, 'username': 'johnson'});
			   const savedValue0 = await refValue0.save();   
               console.log("the value of one task inserted is ") 
                console.log(savedValue0)             
            
            
               const refValue1 = new User({'id': 2, 'username': 'thompson'});
			   const savedValue1 = await refValue1.save();   
               console.log("the value of Two task inserted is ") 
                console.log(savedValue1)             
            
            
               const refValue2 = new User({'id': 3, 'username': 'innocent'});
			   const savedValue2 = await refValue2.save();   
               console.log("the value of three task inserted is ") 
                console.log(savedValue2)             
            
            
    
                const refValue3 = await User.findOne({'username': 'friday'});
                console.log( "task four Retrieved value is");
                console.log(refValue3);  
  
            
              const refValue4 = await User.findOneAndUpdate({'id': 2},{'username': 'friday'},{ new: true });
               console.log("Task +four");
                  
            
    
                const refValue5 = await User.findOne({'id': 2});
                console.log( "task five Retrieved value is");
                console.log(refValue5);  
  
            
                         }catch(e){
                             console.log(e.errmsg)
                      }
                    })();