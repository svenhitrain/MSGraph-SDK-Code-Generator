<?php
/**
* Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
* 
* ParticipantEndpoint File
* PHP version 7
*
* @category  Library
* @package   Microsoft.Graph
* @copyright (c) Microsoft Corporation. All rights reserved.
* @license   https://opensource.org/licenses/MIT MIT License
* @link      https://graph.microsoft.com
*/
namespace Beta\Microsoft\Graph\CallRecords\Model;
/**
* ParticipantEndpoint class
*
* @category  Model
* @package   Microsoft.Graph
* @copyright (c) Microsoft Corporation. All rights reserved.
* @license   https://opensource.org/licenses/MIT MIT License
* @link      https://graph.microsoft.com
*/
class ParticipantEndpoint extends Endpoint
{

    /**
    * Gets the identity
    *
    * @return Beta\Microsoft\Graph\Model\IdentitySet The identity
    */
    public function getIdentity()
    {
        if (array_key_exists("identity", $this->_propDict)) {
            if (is_a($this->_propDict["identity"], "Beta\Microsoft\Graph\Model\IdentitySet")) {
                return $this->_propDict["identity"];
            } else {
                $this->_propDict["identity"] = new Beta\Microsoft\Graph\Model\IdentitySet($this->_propDict["identity"]);
                return $this->_propDict["identity"];
            }
        }
        return null;
    }

    /**
    * Sets the identity
    *
    * @param Beta\Microsoft\Graph\Model\IdentitySet $val The value to assign to the identity
    *
    * @return ParticipantEndpoint The ParticipantEndpoint
    */
    public function setIdentity($val)
    {
        $this->_propDict["identity"] = $val;
         return $this;
    }

    /**
    * Gets the feedback
    *
    * @return UserFeedback The feedback
    */
    public function getFeedback()
    {
        if (array_key_exists("feedback", $this->_propDict)) {
            if (is_a($this->_propDict["feedback"], "Beta\Microsoft\Graph\CallRecords\Model\UserFeedback")) {
                return $this->_propDict["feedback"];
            } else {
                $this->_propDict["feedback"] = new UserFeedback($this->_propDict["feedback"]);
                return $this->_propDict["feedback"];
            }
        }
        return null;
    }

    /**
    * Sets the feedback
    *
    * @param UserFeedback $val The value to assign to the feedback
    *
    * @return ParticipantEndpoint The ParticipantEndpoint
    */
    public function setFeedback($val)
    {
        $this->_propDict["feedback"] = $val;
         return $this;
    }
}
