//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace VoiceProcessingService
{
    using System;
    using System.Collections.Generic;
    
    public partial class audioTranslation
    {
        public int id { get; set; }
        public Nullable<int> idAudio { get; set; }
        public Nullable<int> idLanguage { get; set; }
        public string translationFileName { get; set; }
    
        public virtual audioNote audioNote { get; set; }
    }
}
