

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
        
				const Order = mongoose.model("Order",orderSchema);
			
				const User = mongoose.model("User",userSchema);
			
               (async () => {
                             try{
                               await connect()
               const refValue1 = new Order(null);
			   const savedValue1 = await refValue1.save();   
               console.log("the value of one task inserted is ") 
                console.log(savedValue1)             
            
            
               const refValue2 = new Order(null);
			   const savedValue2 = await refValue2.save();   
               console.log("the value of two task inserted is ") 
                console.log(savedValue2)             
            
            
               const refValue3 = new Order(null);
			   const savedValue3 = await refValue3.save();   
               console.log("the value of three task inserted is ") 
                console.log(savedValue3)             
            
            
    
                const refValue4 = await User.findOne(null);
                console.log( "task four Retrieved value is");
                console.log(refValue4);  
  
            
				
				const refValue5 = await User.deleteOne(null);
                console.log( "task five is deleted"); 
            
              const refValue6 = await Order.findOneAndUpdate({'userOrder': '663668fd0e86aa4eb5a1888400000'},{'price': 45}, { new: true });
               console.log("Task +six");
                  
            
                         }catch(e){
                             console.log(e.errmsg)
                      }
                    })();