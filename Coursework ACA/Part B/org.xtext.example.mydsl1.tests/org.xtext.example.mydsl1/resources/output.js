

            const { MongoClient } = require('mongodb');
            const client = new MongoClient("mongodb+srv://anigbojohnsona:Sonship123@cluster0.kybkuyh.mongodb.net/FTMP?retryWrites=true&w=majority",{ useNewUrlParser: true, useUnifiedTopology: true });
            let db = undefined;

            async function connect() {
                try {
                    await client.connect();
                    db = await client.db("FTMP");
                    console.log("Connected successfully to server");
                } catch (error) {
                    console.error(error);
                }
            }
           connect()
        
            const userSchema = new mongoose.Schema({
        
            id: {
        
                type: Number,
        
            },
        
            username: {
        
                type: String,
        
            },
        
            }, {
                timestamps: true,
            });
        
            const orderSchema = new mongoose.Schema({
        
            id: {
        
                type: Number,
        
            },
        
            price: {
        
                type: String,
        
            },
        
            userOrder: {
        
                type: mongoose.Schema.Types.ObjectId,
                ref: 'User',
        
            },
        
            }, {
                timestamps: true,
            });
        