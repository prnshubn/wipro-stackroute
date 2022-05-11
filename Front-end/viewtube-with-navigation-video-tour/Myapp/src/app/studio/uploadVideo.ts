export class Upload{
    constructor(
        public videoUrl:string,
        public title:string,
        public description:string,
        public channel:string,
        public duration:string,
        public audience:string,
        public age:string,
        public visibility:string,
        public location:string,
        public license:string,
        public distribution:string,
        public category:string,
        public tags:string[],
        public date:Date
    ){}
}